<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Total des Operations Credit</title>
            </head>
            <body>
                <h2>Total des Operations Credit</h2>
                <table border="3" width="75%">
                    <thead>
                        <th>RIB</th><th colspan="2">Date Releve</th><th colspan="2">Solde</th>
                        <xsl:for-each select="releve">
                            <tr>
                                <td><xsl:value-of select="@RIB"></xsl:value-of></td>
                                <td colspan="2">
                                    <xsl:value-of select="dateReleve"></xsl:value-of>
                                </td>
                                <td colspan="2"><xsl:value-of select="solde"></xsl:value-of></td>
                            </tr>
                        </xsl:for-each>
                    </thead>
                    <tr>
                        <th>Operation</th><th>Date</th><th>Description</th><th>Type</th><th>Montant</th>
                    </tr>
                    <xsl:for-each select="releve/operations">
                        <xsl:variable name="opCount" select="count(operation)"/>
                        <td rowspan="{$opCount}">
                            Date Debut: <xsl:value-of select="@dateDebut"></xsl:value-of>
                            <br/>
                            Date Fin: <xsl:value-of select="@dateFin"></xsl:value-of>
                        </td>
                        <xsl:for-each select="operation[@type='CREDIT']">
                            <tr>    
                                <td><xsl:value-of select="@date"/></td>
                                <td><xsl:value-of select="@description"/></td>
                                <td><xsl:value-of select="@type"/></td>
                                <td><xsl:value-of select="@montant"/></td>
                            </tr>
                        </xsl:for-each> 
                        
                    </xsl:for-each>
                    <tr>
                        <td colspan="4">Total des Operations CREDIT: </td>
                        <td><xsl:value-of select="sum(releve/operations/operation[@type='CREDIT']/@montant)"></xsl:value-of></td>
                    </tr>                    
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>