import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação dos personagens e armas conforme a entrada do usuário
        System.out.println("Informe os dados do primeiro personagem:");
        Personagem personagem1 = criarPersonagem(scanner);
        
        System.out.println("Informe os dados do segundo personagem:");
        Personagem personagem2 = criarPersonagem(scanner);
        
        // Realização dos ataques até que um dos personagens esteja morto
        while (!personagem1.estaMorto() && !personagem2.estaMorto()) {
            System.out.println("Informe o ataque (personagem atacante, personagem defensor):");
            int atacante = scanner.nextInt();
            int defensor = scanner.nextInt();
            
            if (atacante == 1 && defensor == 2) {
                personagem1.atacar(personagem2);
            } else if (atacante == 2 && defensor == 1) {
                personagem2.atacar(personagem1);
            } else {
                System.out.println("Ataque inválido. Tente novamente.");
            }
        }
        
        // Exibição do resultado da batalha
        System.out.println("Batalha encerrada!");
        if (personagem1.estaMorto() && personagem2.estaMorto()) {
            System.out.println("Ambos os personagens morreram!");
        } else if (personagem1.estaMorto()) {
            System.out.println("Personagem 1 morreu!");
        } else {
            System.out.println("Personagem 2 morreu!");
        }
        
        scanner.close();
    }
    
    // Método para criar um personagem com base na entrada do usuário
    private static Personagem criarPersonagem(Scanner scanner) {
        String tipo = scanner.next();
        double saude = scanner.nextDouble();
        double forca = scanner.nextDouble();
        double destreza = scanner.nextDouble();
        int arma = scanner.nextInt();
        
        switch (tipo) {
            case "Mago":
                if (arma == 1) {
                    return new Mago(saude, forca, destreza, new Transmutacao());
                } else {
                    return new Mago(saude, forca, destreza, new Psikappa());
                }
            case "Paladino":
                if (arma == 1) {
                    return new Paladino(saude, forca, destreza, new Espada());
                } else {
                    return new Paladino(saude, forca, destreza, new Lanca());
                }
            case "Clérigo":
                if (arma == 1) {
                    return new Clerigo(saude, forca, destreza, new Martelo());
                } else {
                    return new Clerigo(saude, forca, destreza, new Maca());
                }
            default:
                return null;
        }
    }
}
