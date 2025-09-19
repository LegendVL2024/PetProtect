import java.util.Scanner;
import java.util.List;
import Controller.AdocaoController;
import Controller.AnimalController;
import Controller.UsuarioController;
import Controller.VeterinarioController;
import Controller.ResgateController;
import Controller.DenunciaController;
import View.AdocaoView;
import View.AnimalView;
import View.UsuarioView;
import View.VeterinarioView;
import View.ResgateView;
import View.DenunciaView;
import Model.Adocao;
import Model.Animal;
import Model.Usuario;
import Model.Veterinario;
import Model.Resgate;
import Model.Denuncia;

public class Main 
{
    private static Scanner scanner = new Scanner(System.in);
    private static AdocaoController adocaoController = new AdocaoController();
    private static AnimalController animalController = new AnimalController();
    private static UsuarioController usuarioController = new UsuarioController();
    private static VeterinarioController veterinarioController = new VeterinarioController();
    private static ResgateController resgateController = new ResgateController();
    private static DenunciaController denunciaController = new DenunciaController();
    private static AdocaoView adocaoView = new AdocaoView();
    private static AnimalView animalView = new AnimalView();
    private static UsuarioView usuarioView = new UsuarioView();
    private static VeterinarioView veterinarioView = new VeterinarioView();
    private static ResgateView resgateView = new ResgateView();
    private static DenunciaView denunciaView = new DenunciaView();
    
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gerenciamento Animal ===");
        System.out.println("Bem-vindo ao sistema!");
        
        boolean continuar = true;
        
        while (continuar) {
            exibirMenu();
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    menuAnimais();
                    break;
                case 2:
                    menuUsuarios();
                    break;
                case 3:
                    menuAdocoes();
                    break;
                case 4:
                    menuResgates();
                    break;
                case 5:
                    menuVeterinarios();
                    break;
                case 6:
                    menuDenuncias();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            if (continuar) {
                System.out.println("\nPressione Enter para continuar...");
                try {
                    scanner.nextLine();
                } catch (Exception e) {
                    // Handle input exception gracefully
                }
            }
        }
        
        scanner.close();
        System.out.println("Sistema encerrado com sucesso!");
    }
    
    private static void menuAdocoes() {
        boolean voltarMenu = false;
        
        while (!voltarMenu) {
            System.out.println("\n=== MENU ADOÇÕES ===");
            System.out.println("1. Listar todas as adoções");
            System.out.println("2. Adicionar nova adoção");
            System.out.println("3. Buscar adoção por ID");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    listarAdocoes();
                    break;
                case 2:
                    adicionarAdocao();
                    break;
                case 3:
                    buscarAdocao();
                    break;
                case 0:
                    voltarMenu = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            if (!voltarMenu) {
                System.out.println("\nPressione Enter para continuar...");
                try {
                    scanner.nextLine();
                } catch (Exception e) {
                    // Handle input exception gracefully
                }
            }
        }
    }
    
    private static void menuAnimais() {
        boolean voltarMenu = false;
        
        while (!voltarMenu) {
            System.out.println("\n=== MENU ANIMAIS ===");
            System.out.println("1. Listar todos os animais");
            System.out.println("2. Adicionar novo animal");
            System.out.println("3. Remover animal");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    listarAnimais();
                    break;
                case 2:
                    adicionarAnimal();
                    break;
                case 3:
                    removerAnimal();
                    break;
                case 0:
                    voltarMenu = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            if (!voltarMenu) {
                System.out.println("\nPressione Enter para continuar...");
                try {
                    scanner.nextLine();
                } catch (Exception e) {
                    // Handle input exception gracefully
                }
            }
        }
    }
    
    private static void listarAdocoes() {
        System.out.println("\n=== LISTANDO ADOÇÕES ===");
        try {
            List<Adocao> adocoes = adocaoController.listarAdocoes();
            if (adocoes.isEmpty()) {
                System.out.println("Nenhuma adoção encontrada.");
            } else {
                adocaoView.mostrarAdocoes(adocoes);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar adoções: " + e.getMessage());
        }
    }
    
    private static void adicionarAdocao() {
        System.out.println("\n=== ADICIONAR NOVA ADOÇÃO ===");
        System.out.print("ID do Usuário: ");
        int idUsuario = lerOpcao();
        
        System.out.print("ID do Animal: ");
        int idAnimal = lerOpcao();
        
        System.out.print("ID do Veterinário: ");
        int idVeterinario = lerOpcao();
        
        System.out.print("Data da Adoção (DD/MM/YYYY): ");
        String dataAdocao = scanner.nextLine();
        
        System.out.print("Status: ");
        String status = scanner.nextLine();
        
        System.out.print("Observações: ");
        String observacoes = scanner.nextLine();
        
        // Por enquanto, vamos apenas mostrar os dados que seriam salvos
        Adocao novaAdocao = new Adocao(0, idUsuario, idAnimal, idVeterinario, dataAdocao, status, observacoes);
        System.out.println("Adoção adicionada: " + novaAdocao.toString());
    }
    
    private static void buscarAdocao() {
        System.out.println("\n=== BUSCAR ADOÇÃO ===");
        System.out.print("Digite o ID da adoção: ");
        int id = lerOpcao();
        System.out.println("Funcionalidade de busca em desenvolvimento. ID pesquisado: " + id);
    }
    
    private static void listarAnimais() {
        System.out.println("\n=== LISTANDO ANIMAIS ===");
        try {
            List<Animal> animais = animalController.listarAnimais();
            if (animais.isEmpty()) {
                System.out.println("Nenhum animal encontrado.");
            } else {
                animalView.mostrarAnimais(animais);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar animais: " + e.getMessage());
        }
    }
    
    private static void adicionarAnimal() {
        System.out.println("\n=== ADICIONAR NOVO ANIMAL ===");
        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();
        
        System.out.print("Localização: ");
        String localizacao = scanner.nextLine();
        
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        
        System.out.print("Espécie: ");
        String especie = scanner.nextLine();
        
        try {
            Animal novoAnimal = new Animal(0, localizacao, nome, estado, null, raca, especie);
            animalController.adicionarAnimal(novoAnimal, null);
            System.out.println("Animal adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar animal: " + e.getMessage());
        }
    }
    
    private static void removerAnimal() {
        System.out.println("\n=== REMOVER ANIMAL ===");
        System.out.print("Digite o ID do animal a ser removido: ");
        int id = lerOpcao();
        
        try {
            animalController.removerAnimal(id);
        } catch (Exception e) {
            System.out.println("Erro ao remover animal: " + e.getMessage());
        }
    }
    
    private static void exibirMenu() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Gerenciar Animais");
        System.out.println("2. Gerenciar Usuários");
        System.out.println("3. Gerenciar Adoções");
        System.out.println("4. Gerenciar Resgates");
        System.out.println("5. Gerenciar Veterinários");
        System.out.println("6. Gerenciar Denúncias");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static void menuUsuarios() {
        boolean voltarMenu = false;
        
        while (!voltarMenu) {
            System.out.println("\n=== MENU USUÁRIOS ===");
            System.out.println("1. Listar todos os usuários");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    listarUsuarios();
                    break;
                case 0:
                    voltarMenu = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            if (!voltarMenu) {
                System.out.println("\nPressione Enter para continuar...");
                try {
                    scanner.nextLine();
                } catch (Exception e) {
                    // Handle input exception gracefully
                }
            }
        }
    }
    
    private static void menuVeterinarios() {
        boolean voltarMenu = false;
        
        while (!voltarMenu) {
            System.out.println("\n=== MENU VETERINÁRIOS ===");
            System.out.println("1. Listar todos os veterinários");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    listarVeterinarios();
                    break;
                case 0:
                    voltarMenu = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            if (!voltarMenu) {
                System.out.println("\nPressione Enter para continuar...");
                try {
                    scanner.nextLine();
                } catch (Exception e) {
                    // Handle input exception gracefully
                }
            }
        }
    }
    
    private static void menuResgates() {
        boolean voltarMenu = false;
        
        while (!voltarMenu) {
            System.out.println("\n=== MENU RESGATES ===");
            System.out.println("1. Listar todos os resgates");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    listarResgates();
                    break;
                case 0:
                    voltarMenu = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            if (!voltarMenu) {
                System.out.println("\nPressione Enter para continuar...");
                try {
                    scanner.nextLine();
                } catch (Exception e) {
                    // Handle input exception gracefully
                }
            }
        }
    }
    
    private static void menuDenuncias() {
        boolean voltarMenu = false;
        
        while (!voltarMenu) {
            System.out.println("\n=== MENU DENÚNCIAS ===");
            System.out.println("1. Listar todas as denúncias");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    listarDenuncias();
                    break;
                case 0:
                    voltarMenu = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
            if (!voltarMenu) {
                System.out.println("\nPressione Enter para continuar...");
                try {
                    scanner.nextLine();
                } catch (Exception e) {
                    // Handle input exception gracefully
                }
            }
        }
    }
    
    private static void listarUsuarios() {
        System.out.println("\n=== LISTANDO USUÁRIOS ===");
        try {
            List<Usuario> usuarios = usuarioController.listarUsuarios();
            if (usuarios.isEmpty()) {
                System.out.println("Nenhum usuário encontrado.");
            } else {
                usuarioView.mostrarUsuarios(usuarios);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar usuários: " + e.getMessage());
        }
    }
    
    private static void listarVeterinarios() {
        System.out.println("\n=== LISTANDO VETERINÁRIOS ===");
        try {
            List<Veterinario> veterinarios = veterinarioController.listarVeterinarios();
            if (veterinarios.isEmpty()) {
                System.out.println("Nenhum veterinário encontrado.");
            } else {
                veterinarioView.mostrarVeterinarios(veterinarios);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar veterinários: " + e.getMessage());
        }
    }
    
    private static void listarResgates() {
        System.out.println("\n=== LISTANDO RESGATES ===");
        try {
            List<Resgate> resgates = resgateController.listarResgates();
            if (resgates.isEmpty()) {
                System.out.println("Nenhum resgate encontrado.");
            } else {
                resgateView.mostrarResgates(resgates);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar resgates: " + e.getMessage());
        }
    }
    
    private static void listarDenuncias() {
        System.out.println("\n=== LISTANDO DENÚNCIAS ===");
        try {
            List<Denuncia> denuncias = denunciaController.listarDenuncias();
            if (denuncias.isEmpty()) {
                System.out.println("Nenhuma denúncia encontrada.");
            } else {
                denunciaView.mostrarDenuncias(denuncias);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar denúncias: " + e.getMessage());
        }
    }
    
    private static int lerOpcao() {
        try {
            String entrada = scanner.nextLine();
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
} 
