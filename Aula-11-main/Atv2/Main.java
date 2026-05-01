package Atv2;

class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "senha123");
        Administrador admin = new Administrador("Maria", "admin456");

        System.out.println("Autenticação do usuário: " + usuario.autenticar("senha143"));
        System.out.println("Autenticação do administrador: " + admin.autenticar("admin416"));
    }
}
