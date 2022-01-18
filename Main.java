package lab_3;

public class Main {
    public static void main(String[] args){
        Shorty Neznaika = new Shorty("Незнайка",3);
        Shorty Kozlik = new Shorty("Козлик",4);
        Shorty Zhulio = new Shorty("Жулио",2);

        Door door = new Door(false);
        Lamp lamp = new Lamp(false);

        Neznaika.takeGun(GunType.SWORD);
        Kozlik.takeGun(GunType.MINIGUN);
        Zhulio.takeGun(GunType.DESERTEAGLE);
        lamp.toggle(Kozlik);
        if (lamp.NeznaikaCheck()){
            System.out.println("Путники миновали беды и теперь идут по освещенному коридору.");
        }
        else{
            System.out.println("Беды не миновать!!! (Но свет всё же включили и теперь путники пойдут не в темноте...");
            FightLobby fightLobby = new FightLobby(Neznaika,Kozlik);
            fightLobby.start();
        }



        if (Neznaika.getHealthPoints() > 0){
            door.toggle(Neznaika);
            if (door.NeznaikaCheck()){
                System.out.println("Путники миновали беды и спустились по небольшой винтовой лестничке вниз и очутились в подземном гараже.");
            }
            else{
                FightLobby fightLobby = new FightLobby(Neznaika,Kozlik);
                fightLobby.start();
            }
        }
        else{
            door.toggle(Zhulio);
            System.out.println("Путники миновали беды и спустились по небольшой винтовой лестничке вниз и очутились в подземном гараже.");
        }
    }



}
