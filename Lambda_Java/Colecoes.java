package Lambda_Java;

public class Colecoes {
    
        private String nome;
        private String sexo;
        
        public Colecoes(String n, String s) {
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
        
        public String getSexo() {
            return sexo;
        }
        
        @Override
        public String toString() {
            return "Homens: nome " + nome + ", sexo " + sexo;
        }
    
}
