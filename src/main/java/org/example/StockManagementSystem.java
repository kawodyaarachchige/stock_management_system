package org.example;
import java.util.*;
public class StockManagementSystem {
        static Scanner input=new Scanner(System.in);				//scanner
        static String[] logindetails= new String[]{"Tharushi","1234"};	//login detail array
        static String[][] supplier=new String[1][3];				//supplier array
        static String[][] item=new String[1][2];					//item category array
        static String[][] items=new String[1][8];					//items array
        static int index=0;
        static int supnumber=1;
        static int itemnumber=1;

        public static void main(String args[]){					//main method

            login();
        }

        public static void login(){							//login method
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.printf("|				%s		           	  |\n","LOGIN PAGE");
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println();
            L1:	while(true){
                System.out.print("User Name : ");
                String username=input.next();

                if(username.equals(logindetails[0])){

                    L2:	while(true){
                        System.out.println();
                        System.out.print("Password : ");
                        String password=input.next();

                        if(password.equals(logindetails[1])){
                            clearConsole();
                            dashboard();
                            break L1;
                        }else{
                            System.out.println("Password is incorrect. please try again!");
                            continue L2;
                        }
                    }
                }else{
                    System.out.println("User name is invalid. please try again!");
                    System.out.println();
                    continue L1;
                }
            }
        }

        public static void dashboard(){					//dashboard method

            L1:	while(true){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  		  %s           	  |\n","WELCOME TO IJSE STOCK MANAGEMENT SYSTEM");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                System.out.print("[1] Change the Credentials\t");
                System.out.println("[2] Supplir Manage");
                System.out.print("[3] Stock Manage\t\t");
                System.out.println("[4] Log Out");
                System.out.println("[5] Exit the system");
                System.out.println();
                System.out.print("Enter an option to continue > ");
                String option=input.next();

                switch(option){
                    case "1" :
                        clearConsole();
                        changeCredential();
                        break;
                    case "2" :
                        clearConsole();
                        suplierManage();
                        break;
                    case "3" :
                        clearConsole();
                        stockManage();
                        break;
                    case "4" :
                        clearConsole();
                        login();
                        break;
                    case "5" :
                        L2:	while(true){
                            System.out.print("Are you sure exit the system?(Y/N) ");
                            char ch=input.next().charAt(0);
                            if(ch=='Y' || ch=='y'){
                                clearConsole();
                                System.out.println();
                                for (int i = 1; i <= 1; i++) {
                                    String[] words = "THANKS USE IJSE STOCK MANAGEMENT SYSTEM".split(" ");
                                    for (String word : words) {
                                        System.out.print(word+" ");
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                clearConsole();
                                System.exit(0);
                            }else if(ch=='N' || ch=='n'){
                                clearConsole();
                                continue L1;
                            }else{
                                System.out.println("Wrong enter.try again..");
                                System.out.println();
                                continue L2;
                            }
                        }

                    default :
                        System.out.println("Wrong enter..please try again!");
                        System.out.println();
                        clearConsole();
                        continue L1;
                }
                break;
            }
        }

        public static void changeCredential(){			//change credential
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.printf("|  			    %s           		  |\n","CREDENTIAL MANAGE");
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println();
            L1:	while(true){
                System.out.print("Please enter the user name to verify it's you : ");
                String username=input.next();
                if(username.equals(logindetails[0])){
                    System.out.println("Hey danujav");
                    System.out.println();
                    L2:	while(true){

                        System.out.print("Enter your current password : ");
                        String password=input.next();
                        if(password.equals(logindetails[1])){

                            System.out.print("Enter your new password : ");
                            logindetails[1]=input.next();
                            System.out.println();

                            L3:while(true){
                                System.out.print("Password changed successfully! Do you go to home page (Y/N) : ");
                                char letter=input.next().charAt(0);

                                if(letter=='Y' | letter=='y'){
                                    clearConsole();
                                    dashboard();
                                }else if(letter=='N' | letter=='n'){
                                    System.out.println();
                                    continue L1;
                                }else{
                                    System.out.println("Wrong enter..try again!");
                                    System.out.println();
                                    continue L3;
                                }
                                break;
                            }

                        }else{
                            System.out.println("incorrect password. try again!");
                            System.out.println();
                            continue L2;
                        }
                    }

                }else{
                    System.out.println("invalid user name. try again!");
                    System.out.println();
                    continue L1;
                }
            }
        }

        public static void suplierManage(){				//supplier manage
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.printf("|  			     %s             		  |\n","SUPPLIER MANAGE");
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println();
            while(true){
                System.out.print("[1] Add Supplier\t\t");
                System.out.println("[2] Update Supplir");
                System.out.print("[3] Delete Supplier\t\t");
                System.out.println("[4] view Supplier\t\t");
                System.out.print("[5] Search Supplier\t\t");
                System.out.println("[6] Home Page");
                System.out.println();
                System.out.print("Enter an option to continue > ");
                String option=input.next();

                switch(option){
                    case "1" :
                        clearConsole();
                        addsupplier();
                        break;
                    case "2" :
                        clearConsole();
                        updatesupplier();
                        break;
                    case "3" :
                        clearConsole();
                        deleteSupplier();
                        break;
                    case "4" :
                        clearConsole();
                        viewSupplier();
                        break;
                    case "5" :
                        clearConsole();
                        searchSupplier();
                        break;
                    case "6" :
                        clearConsole();
                        dashboard();
                        break;
                    default :
                        System.out.println("Wrong enter..please try again!");
                        System.out.println();
                        clearConsole();
                        continue;
                }
            }

        }

        public static void addsupplier() {				//add supplier
            String id;
            L1: while (true) {
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			       %s               		  |\n","ADD SUPPLIER");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                if (supplier[supplier.length - 1][1] == null) {

                    L2: while(true){
                        System.out.print("Supplier ID: ");
                        id = input.next();

                        for (int i = 0; i < supplier.length; i++) {
                            if (supplier[i][1] != null && supplier[i][1].equals(id)) {
                                System.out.println("already exists. try another supplier id!");
                                System.out.println();
                                continue L2;
                            }
                        }
                        break;
                    }
                    supplier[supplier.length - 1][1] = id;
                    String strnumber = String.valueOf(supnumber);
                    supplier[supplier.length-1][0]=strnumber;
                    System.out.print("Supplier name : ");
                    supplier[supplier.length - 1][2]=input.next();
                    supnumber++;


                    System.out.print("added successfully! Do you want to add another supplier (Y/N) ? ");
                    char ch=input.next().charAt(0);


                    if(ch=='Y' || ch=='y'){

                        growsupplier();
                        clearConsole();
                        continue L1;
                    }else if(ch=='N' || ch=='n'){
                        clearConsole();
                        suplierManage();
                    }else{
                        System.out.println("Wrong enter.try again!");
                        System.out.println();
                    }

                } else {
                    growsupplier();
                }
                break;
            }
        }

        public static void updatesupplier(){			//update supplier

            L1:	while(true){

                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			       %s               		  |\n","UPDATE SUPPLIER");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();


                if (supplier[supplier.length-1][0]!=null) {

                    L2:	while(true){
                        System.out.print("Supplier ID : ");
                        String id=input.next();
                        boolean found = false;
                        for (int i = 0; i < supplier.length; i++){
                            if(supplier[i][1] != null &&supplier[i][1].equals(id)){

                                System.out.println(supplier[i][2]);
                                System.out.println();

                                System.out.print("Enter the new supplier name : ");
                                supplier[i][2]=input.next();

                                System.out.print("Update Successfully! Do you want to update another supplier ? (Y/N) ");
                                char ch=input.next().charAt(0);
                                if(ch=='Y' || ch=='y'){
                                    found=true;
                                    break;
                                }else if(ch=='N' || ch=='n'){
                                    clearConsole();
                                    suplierManage();
                                }
                            }
                        }
                        if (found) {
                            clearConsole();
                            continue L1;
                        }else{
                            System.out.println("can't find supplier id. try again!");
                            continue L2;
                        }
                    }
                }else {
                    System.out.println();
                    System.out.print("No Suppliers.Do you want to add Suppliers(Y/N)? ");
                    char cha=input.next().charAt(0);
                    if(cha=='Y' || cha=='y'){
                        clearConsole();
                        addsupplier();
                    }
                }
            }
        }

        public static String[][] deleteSupplier() {		//delete supplier

            L1: while (true) {
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			       %s               		  |\n","DELETE SUPPLIER");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();

                if(supplier.length > 0){

                    String[][] temp = new String[supplier.length - 1][supplier[0].length];
                    int supindex=0;

                    L2: while (true) {
                        System.out.print("Supplier ID: ");
                        String id = input.next();

                        boolean found = false;

                        L3: for (int i = 0; i < supplier.length; i++) {
                            if (supplier[i][1].equals(id)) {
                                found = true;
                                continue L3;
                            }
                            temp[supindex][0] = supplier[i][0];
                            temp[supindex][1] = supplier[i][1];
                            temp[supindex][2] = supplier[i][2];
                            supindex++;
                        }

                        if (found) {
                            System.out.print("Delete successfully! Do you want to delete another? (Y/N) ");
                            char ch = input.next().charAt(0);
                            if (ch == 'Y' || ch == 'y') {
                                if (supplier.length > 1) {
                                    clearConsole();
                                    continue L1;
                                } else {
                                    System.out.println();
                                    System.out.print("No suppliers.Do you want to add supplier(Y/N)? ");
                                    char cha=input.next().charAt(0);
                                    if(cha=='Y' || cha=='y'){
                                        clearConsole();
                                        addsupplier();
                                    }
                                }
                            } else {
                                clearConsole();
                                suplierManage();
                            }
                        } else {
                            System.out.println("Can't find supplier ID. Try again!");
                            System.out.println();
                            continue L2;
                        }
                    }
                }else{
                    System.out.println();
                    System.out.print("No suppliers.Do you want to add supplier(Y/N)? ");
                    char cha=input.next().charAt(0);
                    if(cha=='Y' || cha=='y'){
                        clearConsole();
                        addsupplier();
                    }
                }
            }
        }

        public static void searchSupplier() {			//search supplier

            L1: while (true) {
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			       %s               		  |\n","SEARCH SUPPLIER");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                L2:	while(true){
                    System.out.print("Supplier ID : ");
                    String id = input.next();
                    boolean found = false;

                    for (int i = 0; i < supplier.length; i++) {
                        if (supplier[i][1].equals(id)) {
                            System.out.println("Supplier Name : "+supplier[i][2]);
                            System.out.print("Supplier found! Do you want to search another (Y/N)? ");
                            char ch = input.next().charAt(0);
                            if (ch == 'Y' || ch == 'y') {
                                found = true;
                                clearConsole();
                                break;
                            } else if (ch == 'N' || ch == 'n') {
                                clearConsole();
                                suplierManage();
                            }
                        }
                    }

                    if (found) {
                        continue L1;
                    } else {
                        System.out.println("can't find supplier id. try again!");
                        System.out.println();
                        continue L2;
                    }
                }
            }
        }

        public static void viewSupplier() {				//view supplier
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.printf("|  			       %s               		  |\n","VIEW SUPPLIER");
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println();
            System.out.println("+-----------------------------+");
            System.out.printf("|%-12s | %-12s |%n", "SUPPLIER ID", "SUPPLIER NAME");
            System.out.println("+-----------------------------+");

            for (int i = 0; i < supplier.length; i++) {
                System.out.printf("|%-12s | %-12s  |%n", supplier[i][1], supplier[i][2]);
            }
            System.out.println("+-----------------------------+");
            System.out.print("Do you want to go supplier manage page (Y/N)? ");
            char ch=input.next().charAt(0);
            if(ch=='Y' || ch=='y'){
                clearConsole();
                suplierManage();
            }
        }

        public static void stockManage(){				//stock manage
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.printf("|  			       %s               		  |\n","STOCK MANAGEMENT");
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println();
            while(true){
                System.out.print("[1] Manage Item Categories\t\t");
                System.out.println("[2] Add Item");
                System.out.print("[3] Get Item Supplier Wise\t\t");
                System.out.println("[4] View Item");
                System.out.print("[5] Rank Item Per Unit Price\t\t");
                System.out.println("[6] Home Page");
                System.out.println();
                System.out.print("Enter an option to continue > ");
                String option=input.next();

                switch(option){
                    case "1" :
                        clearConsole();
                        manageItemCategory();
                        break;
                    case "2" :
                        clearConsole();
                        addItem();
                        break;
                    case "3" :
                        clearConsole();
                        getItemSupplierWise();
                        break;
                    case "4" :
                        clearConsole();
                        viewItems();
                        break;
                    case "5" :
                        clearConsole();
                        rankItemsPrice();
                        break;
                    case "6" :
                        clearConsole();
                        dashboard();
                        break;
                    default :
                        System.out.println("Wrong enter..please try again!");
                        System.out.println();
                        continue;
                }
                break;
            }
        }

        public static void manageItemCategory(){		//manage item category
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.printf("|  			      %s       	    	  |\n","MANAGE ITEM CATEGORY");
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println();
            while(true){
                System.out.print("[1] Add New Item Category\t\t");
                System.out.println("[2] Delete Item Category");
                System.out.print("[3] Update Item Category\t\t");
                System.out.println("[4] Stock Management");
                System.out.println();
                System.out.print("Enter an option to continue > ");
                String option=input.next();

                switch(option){
                    case "1" :
                        clearConsole();
                        addItemCategory();
                        break;
                    case "2" :
                        clearConsole();
                        deleteItemCategory();
                        break;
                    case "3" :
                        clearConsole();
                        updateItemCategory();
                        break;
                    case "4" :
                        clearConsole();
                        stockManage();
                        break;
                    default :
                        System.out.println("Wrong enter..please try again!");
                        System.out.println();
                        continue;
                }
                break;
            }

        }

        public static void addItemCategory(){			//add item category

            while(true){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			      %s       	    		  |\n","ADD ITEM CATEGORY");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                if(item[item.length-1][1]==null){
                    System.out.print("Enter the new item category : ");
                    item[item.length-1][1]=input.next();
                    String strnumber = String.valueOf(itemnumber);
                    item[item.length-1][0]=strnumber;
                    itemnumber++;

                    System.out.print("added successfully! Do you want to add another category (Y/N)? ");
                    char ch=input.next().charAt(0);



                    if(ch=='Y' || ch=='y'){
                        growItem();
                        clearConsole();
                        continue;
                    }else if(ch=='N' || ch=='n'){
                        clearConsole();
                        manageItemCategory();
                    }
                }else{
                    growItem();
                }
            }
        }

        public static String[][] deleteItemCategory() {		//delete item category

            L1: while (true) {
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  		 	     %s        		  |\n","DELETE ITEM CATEGORY");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                String[][] temp = new String[item.length - 1][item[0].length];
                int itemindex=0;
                L2: while (true) {
                    System.out.print("Item Category Name: ");
                    String name = input.next();

                    if(item.length>0){

                        boolean found = false;

                        L3:   for (int i = 0; i < item.length; i++) {
                            if (item[i][1].equals(name)) {
                                found = true;
                                continue L3;
                            }
                            temp[itemindex][0] = item[i][0];
                            temp[itemindex][1] = item[i][1];
                            itemindex++;
                        }

                        if (found) {
                            System.out.print("Deleted successfully! Do you want to delete another? (Y/N) ");
                            char ch = input.next().charAt(0);
                            if (ch == 'Y' || ch == 'y') {
                                if (item.length > 1) {
                                    item = temp;
                                    clearConsole();
                                    continue L1;
                                } else {
                                    System.out.println();
                                    System.out.print("No Item Category.Do you want to add Item Category(Y/N)? ");
                                    char cha=input.next().charAt(0);
                                    if(cha=='Y' || cha=='y'){
                                        clearConsole();
                                        addItemCategory();
                                    }
                                }

                            } else if(ch=='N' || ch=='n') {
                                clearConsole();
                                manageItemCategory();
                            }
                        }
                        if (!found) {
                            System.out.println("Can't find Item Category. Try again!");
                            continue L2;
                        }
                    }else{
                        System.out.println();
                        System.out.print("No Item Category.Do you want to add Item Category(Y/N)? ");
                        char cha=input.next().charAt(0);
                        if(cha=='Y' || cha=='y'){
                            clearConsole();
                            addItemCategory();
                        }
                    }
                    break;
                }
            }

        }

        public static void updateItemCategory(){			//update item category

            L1:	while(true){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  		 	     %s        		  |\n","UPDATE ITEM CATEGORY");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                System.out.print("Item Category Name : ");
                String name=input.next();
                boolean found = false;
                for (int i = 0; i < item.length; i++){
                    if(item[i][1] != null && item[i][1].equals(name)){

                        System.out.println(item[i][1]);
                        System.out.println();

                        System.out.print("Enter the new Item Category Name : ");
                        item[i][1]=input.next();

                        System.out.print("Update Successfully! Do you want to update another Item Category Name ? (Y/N) ");
                        char ch=input.next().charAt(0);
                        if(ch=='Y' || ch=='y'){
                            found=true;
                            clearConsole();
                            break;
                        }else if(ch=='N' || ch=='n'){
                            clearConsole();
                            manageItemCategory();
                        }
                    }
                }
                if (found) {
                    continue L1;
                }else{
                    System.out.println("can't find Item Category Name. try again!");
                    continue L1;
                }
            }
        }

        public static void addItem(){					//add items
            String code="";
            L1:	while(true){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			         %s       	 		  |\n","ADD ITEM");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                if(item[item.length-1][1]==null){
                    System.out.print("OOPS! It seems that you don't have any item categories in the system.\nDo you want to add a new item category?(Y/N) ");
                    char ch=input.next().charAt(0);
                    if(ch=='Y' || ch=='y'){
                        clearConsole();
                        addItemCategory();
                    }else if(ch=='N' || ch=='n'){
                        clearConsole();
                        stockManage();
                    }
                }
                if(supplier[supplier.length-1][1]==null){
                    System.out.print("OOPS! It seems that you don't have any item supplier in the system.\nDo you want to add a new item supplier?(Y/N) ");
                    char ch=input.next().charAt(0);
                    if(ch=='Y' || ch=='y'){
                        clearConsole();
                        addsupplier();
                    }else if(ch=='N' || ch=='n'){
                        clearConsole();
                        stockManage();
                    }
                }



                L2:	while(true){

                    if(items[items.length-1][0]==null){

                        System.out.print("Item Code : ");
                        code =input.next();

                        for (int m = 0; m < items.length; m++) {
                            if (items[m][0] != null && items[m][0].equals(code)) {
                                System.out.println("already added. try another Item code!");
                                System.out.println();
                                continue L2;
                            }
                        }

                        System.out.println();
                        System.out.println("Supplier list :");

                        System.out.println("----------------------------------------------");
                        System.out.printf("|%-12s | %-12s | %-12s |%n","#", "SUPPLIER ID", "SUPPLIER NAME");
                        System.out.println("----------------------------------------------");

                        for (int x = 0; x < supplier.length; x++) {
                            System.out.printf("|%-12s | %-12s | %-12s |%n",supplier[x][0], supplier[x][1], supplier[x][2]);
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println();

                        System.out.print("Enter the supplier number > ");
                        String supnumber=input.next();
                        int intsupnumber = Integer.parseInt(supnumber);


                        System.out.println();
                        System.out.println("Item Categories :");
                        System.out.println("---------------------------");
                        System.out.printf("|%-12s | %-12s |%n","#", "Category");
                        System.out.println("---------------------------");

                        for (int c = 0; c < item.length; c++) {
                            System.out.printf("|%-12s | %-12s |%n",item[c][0], item[c][1]);
                        }
                        System.out.println("---------------------------");

                        System.out.println();
                        System.out.print("Enter the category number > ");
                        String catnumber=input.next();
                        int intcatnumber = Integer.parseInt(catnumber);



                        System.out.println();
                        items[index][0]=code;
                        System.out.print("Description : ");
                        items[index][1]=input.next();
                        System.out.print("Unit price : ");
                        double unitprice=input.nextDouble();
                        String str = Double.toString(unitprice);
                        items[index][2]=str;
                        System.out.print("Qty on hand : ");
                        int qty=input.nextInt();
                        String strqty=Integer.toString(qty);
                        items[index][3]=strqty;

                        for (int i = 0; i < supplier.length; i++)
                        {
                            if(supplier[i][0].equals(supnumber)){
                                items[index][4]=supplier[i][1];
                                items[index][6]=supplier[i][2];
                                break;
                            }
                        }
                        for (int p = 0; p < item.length; p++)
                        {
                            if(item[p][0].equals(catnumber)){
                                items[index][5]=item[p][1];
                                items[index][7]=item[p][0];
                                break;
                            }
                        }

                        L3:	while(true){
                            System.out.print("added successfully! Do you want to add another Item(Y/N)? ");
                            char ch=input.next().charAt(0);
                            if(ch=='Y' || ch=='y'){
                                clearConsole();
                                index++;
                                items=growItems();
                                continue L1;
                            }else if(ch=='N' || ch=='n'){
                                index++;
                                clearConsole();
                                stockManage();
                            }else{
                                System.out.println("Wrong enter.try again..");
                                System.out.println();
                                continue L3;
                            }
                        }
                    }else{
                        items=growItems();
                        continue L2;
                    }
                }

            }
        }

        public static void rankItemsPrice() {			//rank item by price
            L1:	while(true){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			      %s       	 		  |\n","RANKED UNIT PRICE");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();

                String[] temp=new String[items[0].length];

                for (int i = 0; i < items.length - 1; i++) {
                    for (int j = 0; j < items.length - i - 1; j++) {
                        double currentPrice = Double.parseDouble(items[j][2]);
                        double nextPrice = Double.parseDouble(items[j + 1][2]);

                        if (currentPrice > nextPrice) {
                            temp = items[j];
                            items[j] = items[j + 1];
                            items[j + 1] = temp;
                        }
                    }
                }

                System.out.printf("+-----------------------------------------------------------------------------+\n");
                System.out.printf("|%-12s|%-12s|%-12s|%-12s|%-12s|%-12s|\n", "SID", "CODE", "DESC", "PRICE", "QTY","CAT");
                System.out.printf("+-----------------------------------------------------------------------------+\n");

                for (int i = 0; i < items.length; i++) {
                    System.out.printf("|%-12s|%-12s|%-12s|%-12s|%-12s|%-12s|\n",
                            items[i][4], items[i][0], items[i][1], items[i][2], items[i][3],items[i][5]);
                }

                System.out.printf("+-----------------------------------------------------------------------------+\n");
                System.out.println();
                System.out.print("Do you want to go stock manage page?(Y/N) ");
                char ch=input.next().charAt(0);
                if(ch=='Y' || ch=='y'){
                    clearConsole();
                    stockManage();
                }else if(ch=='N' || ch=='n'){
                    clearConsole();
                    continue L1;
                }
            }

        }


        public static void getItemSupplierWise() {		//get item by spplier wise
            L1:	while(true){
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.printf("|  			         %s       	 		  |\n","SEARCH SUPPLIER");
                System.out.println("+-------------------------------------------------------------------------+");
                System.out.println();
                boolean flag = false;
                int index=-1;

                L2: while(true){
                    System.out.print("Enter Supplier ID: ");
                    String id = input.next();
                    for (int j = 0; j < supplier.length; j++)
                    {
                        if(supplier[j][1].equals(id)){
                            System.out.println("Supplier Name: "+supplier[j][2]);
                            System.out.println();
                            break;
                        }
                    }


                    System.out.printf("+-----------------------------------------------------------------------------------------+\n");
                    System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |\n", "ITEM CODE", "DESCRIPTION", "UNIT PRICE", "QTY ON HAND", "CATEGORY");
                    System.out.printf("+-----------------------------------------------------------------------------------------+\n");

                    for (int i = 0; i < items.length; i++) {
                        if (items[i][4].equals(id)) {
                            flag = true;
                            index=i;

                            System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |\n",items[i][0], items[i][1], items[i][2], items[i][3], items[i][5]);
                        }
                    }
                    System.out.printf("+-----------------------------------------------------------------------------------------+\n");

                    if (!flag) {
                        System.out.println("No items found for the given supplier ID.");
                        continue L2;
                    }
                    L3:	while(true){
                        System.out.print("Search successfully! Do you want to another search ?(Y/N) ");
                        char ch=input.next().charAt(0);
                        if(ch=='Y' || ch=='y'){
                            clearConsole();
                            continue L1;
                        }else if(ch=='N' || ch=='n'){
                            clearConsole();
                            stockManage();
                        }else{
                            System.out.println("Wrong enter option! try again");
                            continue L3;
                        }
                    }
                }
            }
        }

        public static void viewItems() {				// view items
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.printf("|  			         %s       	 		  |\n","VIEW ITEMS");
            System.out.println("+-------------------------------------------------------------------------+");
            System.out.println();
            for (int i = 0; i < item.length; i++) {
                String Code = item[i][0];
                String Name = item[i][1];

                System.out.println(Name+":");
                System.out.printf("+----------------------------------------------------------------------+\n");
                System.out.printf("|%-13s|%-14s|%-13s|%-14s|%-12s|\n", "SID", "CODE", "DESC", "PRICE", "QTY");
                System.out.printf("+----------------------------------------------------------------------+\n");

                for (int j = 0; j < items.length; j++) {
                    if (items[j][7].equals(Code)) {
                        System.out.printf("|%-13s|%-14s|%-13s|%-14s|%-12s|\n", items[j][4], items[j][0], items[j][1], items[j][2], items[j][3]);
                    }
                }

                System.out.printf("+----------------------------------------------------------------------+\n");
                System.out.println();
            }

            System.out.print("Do you want to go to the stock management page? (Y/N) ");
            char ch = input.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                clearConsole();
                stockManage();
            }
        }


        public static String[][] growItems(){			//grow items array
            String[][] temp=new String[items.length+1][items[0].length];
            for (int i = 0; i < items.length; i++)
            {
                for (int j = 0; j < items[i].length; j++)
                {
                    temp[i][j]=items[i][j];
                }

            }
            items=temp;
            return items;
        }

        public static String[][] growItem() {			// grow item category array
            String[][] tempItem = new String[item.length + 1][item[0].length];
            for (int i = 0; i < item.length; i++) {
                for (int j = 0; j < item[i].length; j++) {
                    tempItem[i][j] = item[i][j];
                }
            }
            item = tempItem;
            return item;
        }


        public static String[][] growsupplier(){		//grow supplier array
            String[][] tempsupplier=new String[supplier.length+1][supplier[0].length];
            for (int i = 0; i < supplier.length; i++){
                for (int j = 0; j < supplier[i].length; j++){
                    tempsupplier[i][j]=supplier[i][j];
                }

            }
            supplier=tempsupplier;
            return supplier;
        }

        private final static void clearConsole() {		//clear console method
            final String os = System.getProperty("os.name");
            try {
                if (os.equals("Linux")) {
                    System.out.print("\033\143");
                } else if (os.equals("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            } catch (final Exception e) {
                //handle the exception
                System.err.println(e.getMessage());
            }
        }
}
