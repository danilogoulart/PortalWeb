package model;



import java.util.Date;

/**
*
* @author Danilo
*/
public class Fixa {

    private int idFixa;
    private boolean status;
    private String descricao;
    private Date Dia;
    private String nome_categoria;

    /**
    * Construtor
    */
    public Fixa(){}

    /**
    * seta o valor de idFixa
    * @param pIdFixa
    */
    public void setIdFixa(int pIdFixa){
        this.idFixa = pIdFixa;
    }
    /**
    * return pk_idFixa
    */
    public int getIdFixa(){
        return this.idFixa;
    }

    /**
    * seta o valor de status
    * @param pStatus
    */
    public void setStatus(boolean pStatus){
        this.status = pStatus;
    }
    /**
    * return status
    */
    public boolean isStatus(){
        return this.status;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    /**
    * seta o valor de Dia
    * @param pDia
    */
    public void setDia(Date pDia){
        this.Dia = pDia;
    }
    /**
    * return Dia
    */
    public Date getDia(){
        return this.Dia;
    }

    @Override
    public String toString(){
        return "ModelFixa {" + "::idFixa = " + this.idFixa + "::status = " + this.status + "::descricao = " + this.descricao + "::Dia = " + this.Dia + "::id_categoria = " + this.nome_categoria +  "}";
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }
}