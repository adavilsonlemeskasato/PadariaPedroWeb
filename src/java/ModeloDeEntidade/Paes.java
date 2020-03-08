/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDeEntidade;

/**
 *
 * @author davi
 */
public class Paes {

    private int CODIGO_PRODUTO;
    private String NOME_PRODUTO;
    private String DESC_PRODUTO;
    private String VALOR_PRODUTO;
    private String IMG_PRODUTO;
    private int COD_CAT_PRODUTO;

    @Override
    public String toString() {
        return "Paes{" + "CODIGO_PRODUTO=" + CODIGO_PRODUTO + ", NOME_PRODUTO=" + NOME_PRODUTO + ", DESC_PRODUTO=" + DESC_PRODUTO + ", VALOR_PRODUTO=" + VALOR_PRODUTO + ", IMG_PRODUTO=" + IMG_PRODUTO + ", COD_CAT_PRODUTO=" + COD_CAT_PRODUTO + '}';
    }

    public Paes(int CODIGO_PRODUTO, String NOME_PRODUTO, String DESC_PRODUTO, String VALOR_PRODUTO, String IMG_PRODUTO, int COD_CAT_PRODUTO) {
        this.CODIGO_PRODUTO = CODIGO_PRODUTO;
        this.NOME_PRODUTO = NOME_PRODUTO;
        this.DESC_PRODUTO = DESC_PRODUTO;
        this.VALOR_PRODUTO = VALOR_PRODUTO;
        this.IMG_PRODUTO = IMG_PRODUTO;
        this.COD_CAT_PRODUTO = COD_CAT_PRODUTO;
    }

    public int getCODIGO_PRODUTO() {
        return CODIGO_PRODUTO;
    }

    public void setCODIGO_PRODUTO(int CODIGO_PRODUTO) {
        this.CODIGO_PRODUTO = CODIGO_PRODUTO;
    }

    public String getNOME_PRODUTO() {
        return NOME_PRODUTO;
    }

    public void setNOME_PRODUTO(String NOME_PRODUTO) {
        this.NOME_PRODUTO = NOME_PRODUTO;
    }

    public String getDESC_PRODUTO() {
        return DESC_PRODUTO;
    }

    public void setDESC_PRODUTO(String DESC_PRODUTO) {
        this.DESC_PRODUTO = DESC_PRODUTO;
    }

    public String getVALOR_PRODUTO() {
        return VALOR_PRODUTO;
    }

    public void setVALOR_PRODUTO(String VALOR_PRODUTO) {
        this.VALOR_PRODUTO = VALOR_PRODUTO;
    }

    public String getIMG_PRODUTO() {
        return IMG_PRODUTO;
    }

    public void setIMG_PRODUTO(String IMG_PRODUTO) {
        this.IMG_PRODUTO = IMG_PRODUTO;
    }

    public int getCOD_CAT_PRODUTO() {
        return COD_CAT_PRODUTO;
    }

    public void setCOD_CAT_PRODUTO(int COD_CAT_PRODUTO) {
        this.COD_CAT_PRODUTO = COD_CAT_PRODUTO;
    }

}
