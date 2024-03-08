package Lambda_Java;

import java.util.List;

public class ColecoesFeminino {
    private String nome;
    private String sexo;
    
    public ColecoesFeminino(String n, String s) {
        this.setNome(n);
        this.setSexo(s);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Mulheres: nome " + nome + ", sexo " + sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public List<ColecoesFeminino> feminino(){
        ColecoesFeminino fem1 = new ColecoesFeminino("Daniele", "f");
        ColecoesFeminino fem2 = new ColecoesFeminino("Polonia", "f");
        ColecoesFeminino fem3 = new ColecoesFeminino("Neves", "f");
        return List.of(fem1,fem2,fem3);
    }
}
