import java.util.Scanner;
public class Men implements Character{
    protected String Name;
    protected int Level,HP,Mana;
    protected double Speed,downSpeed,maxSpeed,Damage,Defense;
    protected int blevel,bhp,bmana;
    protected double bdamage,bdefense,bspeed,bmaxspeed;
    private double damageTaken;
    public Men() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter yourname: ");
        String name = s.nextLine();

        this.Name = name;
        this.Level = 0;
        this.HP = 100;
        this.Mana = 50;
        this.Speed = 1;
        this.downSpeed = 0;
        this.maxSpeed = 1.0;
        this.Damage = 30;
        this.Defense = 20;
    }

    /**Choose a sword or a shield, or choose both
     *to update HP, Level, Mana, Speed, Damage, Defense.
     * effects:The values of HP, Level, Mana, Speed, Damage, Defense
     *         will change based on the conditions we set.
     */
    @Override
    public void getItem (){
        Scanner s = new Scanner(System.in);
        System.out.print("Choose a sword(sw) or shield(sh) or all(all)  ? : ");
        String sw = s.nextLine();

        if (sw.equals("sw") || sw.equals("sh") || sw.equals("all")){
            if (sw.equals("sw")) {
                System.out.println("\uD83D\uDDE1\uFE0F You choose the sword \uD83D\uDDE1\uFE0F");

                System.out.printf("------------------------------------------%n");
                System.out.printf("|%s | %-15s | %4s | %5s|%n", "NO", "NAME", "LEVEL", "DAMAGE");
                System.out.printf("------------------------------------------%n");

                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 1, "Enma", 6, 60);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 2, "Shusui", 8, 85);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 3, "Yubashiri", 7, 78);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 4, "Wado Ichimonji", 9, 99);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 5, "Sandai Kitetsu", 9, 95);

                Scanner w = new Scanner(System.in);
                System.out.print("You choose sword number: ");
                int swn = w.nextInt();
                if (swn == 1) {
                    this.Level += 6;
                    this.Damage += 60;

                } else if (swn == 2) {
                    this.Level += 8;
                    this.Damage += 85;

                } else if (swn == 3) {
                    this.Level += 7;
                    this.Damage += 78;

                } else if (swn == 4) {
                    this.Level += 9;
                    this.Damage += 99;

                } else if (swn == 5) {
                    this.Level += 9;
                    this.Damage += 95;

                } else {
                    System.out.print("ERROR !!!");
                }

                updateState();
                //Calculate downSpeed to find the current speed.
                downSpeed = Speed*(0.1 + 0.4*Level);
                //set current speed
                Speed = maxSpeed - downSpeed;
                System.out.printf("------------------------------------------%n");

            }

            if (sw.equals("sh")) {
                System.out.println("\uD83D\uDEE1\uFE0F You choose the shield \uD83D\uDEE1\uFE0F");

                System.out.printf("------------------------------------------%n");
                System.out.printf("|%s | %-15s | %4s | %5s|%n", "NO", "NAME", "LEVEL", "DEFENSE");
                System.out.printf("------------------------------------------%n");

                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 1, "Zeus", 9, 98);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 2, "Ares", 6, 60);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 3, "Poseidon", 8, 80);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 4, "Hera", 7, 66);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 5, "Athena", 8, 79);

                Scanner w = new Scanner(System.in);
                System.out.print("You choose shield number: ");
                int swn = w.nextInt();
                if (swn == 1) {
                    this.Level += 9;
                    this.Defense += 98;

                } else if (swn == 2) {
                    this.Level += 6;
                    this.Defense += 60;

                } else if (swn == 3) {
                    this.Level += 8;
                    this.Defense += 80;

                } else if (swn == 4) {
                    this.Level += 7;
                    this.Defense += 66;

                } else if (swn == 5) {
                    this.Level += 8;
                    this.Defense += 79;

                } else {
                    System.out.print("ERROR !!!");
                }

                updateState();
                //Calculate downSpeed to find the current speed.
                downSpeed = Speed*(0.1 + 0.8*Level);
                //set current speed
                Speed = maxSpeed - downSpeed;
                System.out.printf("------------------------------------------%n");

            }
            if (sw.equals("all")) {
                System.out.println("\uD83D\uDD31 You choose all item \uD83D\uDD31");

                System.out.printf("---------------------------------------|  ⚔\uFE0F  |----------------------------------------%n");
                System.out.printf("|%s | %-15s | %4s | %5s |  %-3s |%s | %-15s | %4s | %5s|%n", "NO", "NAME", "LEVEL", "DAMAGE", "⚔\uFE0F","NO", "NAME", "LEVEL", "DEFENSE");
                System.out.printf("---------------------------------------|  ⚔\uFE0F  |----------------------------------------%n");

                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 1, "Enma", 6, 60,"⚔\uFE0F", 1, "Zeus", 9, 98);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 2, "Shusui", 8, 85,"⚔\uFE0F",2, "Ares", 6, 60);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 3, "Yubashiri", 7, 78, "⚔\uFE0F",3, "Poseidon", 8, 80);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 4, "Wado Ichimonji", 9, 99, "⚔\uFE0F",4, "Hera", 7, 66);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 5, "Sandai Kitetsu", 9, 95, "⚔\uFE0F",5, "Athena", 8, 79);


                Scanner w = new Scanner(System.in);
                System.out.print("You choose sword number: ");
                int sw1 = w.nextInt();
                System.out.print("You choose shield number: ");
                int sh2 = w.nextInt();

                if (sw1 == 1 && sh2 == 1) {
                    this.Level += 15;
                    this.Damage += 60;
                    this.Defense += 98;

                } else if (sw1 == 1 && sh2 == 2) {
                    this.Level += 12;
                    this.Damage += 60;
                    this.Defense += 60;

                } else if (sw1 == 1 && sh2 == 3) {
                    this.Level += 14;
                    this.Damage += 60;
                    this.Defense += 80;

                } else if (sw1 == 1 && sh2 == 4) {
                    this.Level += 13;
                    this.Damage += 60;
                    this.Defense += 66;

                } else if (sw1 == 1 && sh2 == 5) {
                    this.Level += 14;
                    this.Damage += 60;
                    this.Defense += 79;

                }else if (sw1 == 2 && sh2 == 1) {
                    this.Level += 17;
                    this.Damage += 85;
                    this.Defense += 98;

                } else if (sw1 == 2 && sh2 == 2) {
                    this.Level += 14;
                    this.Damage += 85;
                    this.Defense += 60;

                } else if (sw1 == 2 && sh2 == 3) {
                    this.Level += 16;
                    this.Damage += 85;
                    this.Defense += 80;

                } else if (sw1 == 2 && sh2 == 4) {
                    this.Level += 15;
                    this.Damage += 85;
                    this.Defense += 66;

                } else if (sw1 == 2 && sh2 == 5) {
                    this.Level += 16;
                    this.Damage += 85;
                    this.Defense += 79;

                }else if (sw1 == 3 && sh2 == 1) {
                    this.Level += 16;
                    this.Damage += 78;
                    this.Defense += 98;

                } else if (sw1 == 3 && sh2 == 2) {
                    this.Level += 13;
                    this.Damage += 78;
                    this.Defense += 60;

                } else if (sw1 == 3 && sh2 == 3) {
                    this.Level += 15;
                    this.Damage += 78;
                    this.Defense += 80;

                } else if (sw1 == 3 && sh2 == 4) {
                    this.Level += 14;
                    this.Damage += 78;
                    this.Defense += 66;

                } else if (sw1 == 3 && sh2 == 5) {
                    this.Level += 15;
                    this.Damage += 78;
                    this.Defense += 79;

                }else if (sw1 == 4 && sh2 == 1) {
                    this.Level += 18;
                    this.Damage += 99;
                    this.Defense += 98;

                } else if (sw1 == 4 && sh2 == 2) {
                    this.Level += 15;
                    this.Damage += 99;
                    this.Defense += 60;

                } else if (sw1 == 4 && sh2 == 3) {
                    this.Level += 17;
                    this.Damage += 99;
                    this.Defense += 80;

                } else if (sw1 == 4 && sh2 == 4) {
                    this.Level += 16;
                    this.Damage += 99;
                    this.Defense += 66;

                } else if (sw1 == 4 && sh2 == 5) {
                    this.Level += 17;
                    this.Damage += 99;
                    this.Defense += 79;

                }else if (sw1 == 5&& sh2 == 1) {
                    this.Level += 18;
                    this.Damage += 95;
                    this.Defense += 98;

                } else if (sw1 == 5 && sh2 == 2) {
                    this.Level += 15;
                    this.Damage += 99;
                    this.Defense += 60;

                } else if (sw1 == 5 && sh2 == 3) {
                    this.Level += 17;
                    this.Damage += 95;
                    this.Defense += 80;

                } else if (sw1 == 5 && sh2 == 4) {
                    this.Level += 16;
                    this.Damage += 95;
                    this.Defense += 66;

                } else if (sw1 == 5 && sh2 == 5) {
                    this.Level += 17;
                    this.Damage += 95;
                    this.Defense += 79;

                }
                else {
                    showError();
                }

                updateState();
                //Calculate downSpeed to find the current speed.
                downSpeed = Speed*(0.1 + 1.2*Level);
                //set current speed
                Speed = maxSpeed - downSpeed;
                System.out.printf("--------------------------------------------------------------------------------------%n");

            }
        }else {
            showError();
        }

    }
    /**Update the current values for HP, Level, Mana, Damage, Defense, and maxSpeed.
     *effects:The values of HP, Level, Mana, Damage, Defense, and maxSpeed
     *        represent the current stats of the character.
     */
    @Override
    public void updateState() {
        HP = 100 + 10 * Level;
        Mana = 50 + 2 * Level;

        Damage = Damage * (1 + 0.1 * Level);
        Defense = Defense * (1 + 0.05 * Level);

        maxSpeed = Speed*(0.1 + 2*Level);
    }
    @Override
    public void showStartState(){

        System.out.printf("╔═══════════════════════════════════════════════╗%n");
        System.out.printf(" %15s %s %s%n", "Hi", this.Name, "㋡!");
        System.out.printf("         %10s %s %n", "Your gender is Men.", "♀!");
        System.out.printf("    ◤ %2s %2s ◢%n","This is starting state of",this.Name);
        System.out.printf("-------------------------------------------------%n");

        System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ",Level, "HP \uD83D\uDC9A: ",HP,"MANA \uD83D\uDC99: ",Mana);
        System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", Damage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", Defense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f",Speed), String.format("%.2f", Speed));

        System.out.printf("-------------------------------------------------%n");
        System.out.printf("╚═══════════════════════════════════════════════╝%n");

    }

    /**To display the current status of the character with and without an accessory.
     * effects:If there is an accessory, display the values for HP, Level, Mana, Damage, Defense, Speed, and maxSpeed.
     *
     * effects:If there is no accessory, display the values for blevel, bhp, bmana, bdamage, bdefense, bspeed, and bmaxspeed.
     */
    @Override
    public void showCurrentState(){

        System.out.printf("╔═══════════════════════════════════════════════╗%n");
        System.out.printf("    ◤ %2s %2s ◢%n","This is current state of",this.Name);

        if(blevel == 0 || bhp == 0 || bmana == 0 || bdamage == 0 || bdefense == 0 || bspeed == 0) {

            System.out.printf("        ⧭ %20s ⧭%n","Did not receive accessories.");
            System.out.printf("-------------------------------------------------%n");

            System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ", Level, "HP \uD83D\uDC9A: ", HP, "MANA \uD83D\uDC99: ", Mana);
            System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", Damage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", Defense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f", Speed), String.format("%.2f", maxSpeed));
        }

        if (blevel != 0 || bhp != 0 || bmana != 0 || bdamage != 0 || bdefense != 0 || bspeed != 0) {

            System.out.printf("        ⧭ %20s ⧭%n","Did not receive accessories.");
            System.out.printf("-------------------------------------------------%n");

            System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ", Level, "HP \uD83D\uDC9A: ", HP, "MANA \uD83D\uDC99: ", Mana);
            System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", Damage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", Defense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f", Speed), String.format("%.2f", maxSpeed));

            System.out.printf("═════════════════════════════════════════════════%n");

            System.out.printf("         ⧭ %20s ⧭%n","Received accessories.");
            System.out.printf("-------------------------------------------------%n");
            System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ", blevel, "HP \uD83D\uDC9A: ", bhp, "MANA \uD83D\uDC99: ", bmana);
            System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", bdamage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", bdefense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f", bspeed), String.format("%.2f", bmaxspeed));
        }

        System.out.printf("-------------------------------------------------%n");
        System.out.printf("╚═══════════════════════════════════════════════╝\n%n");

    }
    @Override
    public void showstateCompleteActivity(){

        System.out.printf("╔═══════════════════════════════════════════════╗%n");
        System.out.printf("    ◤ %2s %2s ◢%n","Status after activity of",this.Name);

        if(blevel == 0 || bhp == 0 || bmana == 0 || bdamage == 0 || bdefense == 0 || bspeed == 0) {

            System.out.printf("-------------------------------------------------%n");

            System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ", Level, "HP \uD83D\uDC9A: ", HP, "MANA \uD83D\uDC99: ", Mana);
            System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", Damage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", Defense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f", Speed), String.format("%.2f", maxSpeed));
        } else{

            System.out.printf("-------------------------------------------------%n");
            System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ", blevel, "HP \uD83D\uDC9A: ", bhp, "MANA \uD83D\uDC99: ", bmana);
            System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", bdamage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", bdefense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f", bspeed), String.format("%.2f", bmaxspeed));
        }

        System.out.printf("-------------------------------------------------%n");
        System.out.printf("╚═══════════════════════════════════════════════╝\n%n");

    }

    /**
     * Display the details of the attack between the current character (Men) and another character (Women).
     * effects:It's just reading the information to display details about the attack, without altering the status or variables within the character.
     *
     */

    public void showDetailAttack(Women women){

        System.out.printf("╔══❖══════════════════⚔\uFE0F══════════════════❖══╗%n");
        System.out.printf("      %2s %2s %2s %n",this.Name,"Attack",women.Name);

        if(damageTaken > 0){
            System.out.printf("%2s %2s %2s %2s%n",this.Name,"Attack more than",women.Name,"Defense");
        }else{
            System.out.printf("%2s %2s %2s %2s%n",this.Name,"Attack lower than",women.Name,"Defense");
        }

        System.out.printf("    %2s %2s  %n","The difference of attacks is: ",this.damageTaken);
        System.out.printf("╚══❖══════════════════⚔\uFE0F══════════════════❖══╝\n%n");

    }
    /**
     * Display the details of the defend between the current character (Men) and another character (Women).
     * effects:It's just reading the information to display details about the defend, without altering the status or variables within the character.
     *
     */
    public void showDetailDefend(Women women){

        System.out.printf("╔══❖══════════════════⚔\uFE0F══════════════════❖══╗%n");
        System.out.printf("      %2s %2s %2s %n",this.Name,"Defend",women.Name);

        if(damageTaken > 0){
            System.out.printf("%2s %2s %2s %2s%n",this.Name,"Defense more than",women.Name,"Attack");
        }else{
            System.out.printf("%2s %2s %2s %2s%n",this.Name,"Defense lower than",women.Name,"Attack");
        }

        System.out.printf("    %2s %2s  %n","The difference of defend is: ",String.format("%.2f", this.damageTaken));
        System.out.printf("╚══❖══════════════════⚔\uFE0F══════════════════❖══╝\n%n");

    }

    @Override
    public void showError(){
        System.out.printf("╔════════════════════════════════════════╗%n");
        System.out.printf("------------------------------------------%n");

        System.out.printf("%30s%n","\uD83D\uDCA3\uD83D\uDCA3\uD83D\uDCA3\uD835\uDD3Cℝℝ\uD835\uDD46ℝ\uD83D\uDCA3\uD83D\uDCA3\uD83D\uDCA3");

        System.out.printf("------------------------------------------%n");
        System.out.printf("╚════════════════════════════════════════╝%n");
    }

    /**
     * To equip an accessory to an object of a certain type, which could be a ring or a veil.
     * @param accessory incoming  must be a Ring or Veil.
     *
     *effects:This method may cause side effects by altering the data within the current object (this) if there are updates from the installed equipment.
     */
    @Override
    public void equipAccessory(Accessories accessory) {
        accessory.addEffect(this);
        if (accessory instanceof Ring) {
            updateFromRing((Ring) accessory);
        } else if (accessory instanceof Veil) {
            updateFromVeil((Veil) accessory);
        }
    }

    /**
     * Used to update the data of an object of a certain type from the information provided by the incoming Ring
     * @param ring incoming must not be null.
     *
     * effects: update the values of blevel, bhp, bmana, bdamage, bdefense, bspeed, and bmaxspeed to the current ones.
     */
    public void updateFromRing(Ring ring) {
        blevel = this.Level + ring.level;
        bhp = this.HP + ring.hp;
        bmana = this.Mana + ring.mana;
        bspeed = Speed + ring.speed*(0.1 + 0.03*blevel);
        bmaxspeed = maxSpeed + ring.speed*(0.1 + 0.03*blevel);
        bdamage = this.Damage + ring.damage;
        bdefense = this.Defense + ring.defense;

    }
    /**
     * Used to update the data of an object of a certain type from the information provided by the incoming Veil
     * @param veil incoming must not be null.
     *
     * effects: update the values of blevel, bhp, bmana, bdamage, bdefense, bspeed, and bmaxspeed to the current ones.
     */
    public void updateFromVeil(Veil veil) {
        blevel = this.Level + veil.level;
        bhp = this.HP + veil.hp;
        bmana = this.Mana + veil.mana;
        bspeed = Speed + veil.speed*(0.1 + 0.03*blevel);
        bmaxspeed = maxSpeed + veil.speed*(0.1 + 0.03*blevel);;
        bdamage = this.Damage + veil.damage;
        bdefense = this.Defense + veil.defense;

    }

    /**
     * Perform an attack by taking the parameter as the targeted Women object.
     * @param  women only
     * effects:An attack will cause a change in the HP and bhp value of both the character (this) and the Women.
     * effects:After the attack is completed, the code will display the attack details through the method showDetailAttack.
     */
    public void Attack(Women women){

        if (blevel == 0 || bhp == 0 || bmana == 0 || bdamage == 0 || bdefense == 0 || bspeed == 0) {
            this.damageTaken = this.Damage - women.Defense;

            if (this.damageTaken > 0) {
                women.HP -= (int) this.damageTaken;
            } else if (this.damageTaken < 0) {
                this.HP -= (int) Math.abs(this.Damage - women.Defense);
            }
        }

        else {
            this.damageTaken = this.bdamage - women.bdefense;

            if (this.damageTaken > 0) {
                women.bhp -= (int) this.damageTaken;
            } else if (this.damageTaken < 0){
                this.bhp -= (int) Math.abs(this.bdamage - women.bdefense);
            }
        }
        showDetailAttack(women);

    }
    /**
     * Perform an defend by taking the parameter as the targeted Women object.
     * @param  women only
     * effects:An defend will cause a change in the HP and bhp value of both the character (this) and the Women.
     * effects:After the Defend is completed, the code will display the defend details through the method showDetailDefend.
     */
    public void Defend(Women women) {

        if (blevel == 0 || bhp == 0 || bmana == 0 || bdamage == 0 || bdefense == 0 || bspeed == 0) {
            this.damageTaken = this.Defense - women.Damage;

            if (this.damageTaken > 0) {
                women.HP -= (int) damageTaken;
            } else if (this.damageTaken < 0) {
                this.HP -= (int) Math.abs(women.Damage - this.Defense);
            }
        } else {
            this.damageTaken = this.bdefense - women.bdamage;

            if (this.damageTaken > 0) {
                women.bhp -= (int) damageTaken;
            } else if (this.damageTaken < 0) {
                this.bhp -= (int) Math.abs(women.bdamage - this.bdefense);
            }
        }
        showDetailDefend(women);
    }
}
