package com.bridgelabz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        static ArrayList<ArrayList> masterAddressBook = new ArrayList<ArrayList>();
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args)
        int choice = 10, count = 0;
        System.out.println("Welcome in AddressBook");
        AddressBook add = new AddressBook();
        ArrayList<Data> contact = new ArrayList<Data>();
        ArrayList<Data> contact1 = new ArrayList<Data>();
        ArrayList<Data> contact2= new ArrayList<Data>();

        while (choice != 0) {
            System.out.println("Press bellow option");
            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add contact. ");
            System.out.println(" 2. Edit contact. ");
            System.out.println(" 3. Display contacts. ");
            System.out.println(" 4. delete contact ");
            System.out.println(" 3. Display contacts");
            System.out.println(" 4. Delete contacts");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("choose your below dictionary ");
                    System.out.println("press 1 to add in contact");
                    System.out.println("press 2 to add in contact1");
                    System.out.println("press 3 to add in contact2");
                    int dic=sc.nextInt();
                    if(dic==1)
                        contact = dictionary(contact);
                    else if(dic==2)
                        contact1 = dictionary(contact1);
                    else if(dic==3)
                        contact2 = dictionary(contact2);
                    break;
                case 2:
                    System.out.println("choose your below dictionary which you want to display ");
                    System.out.println("press 1 to display in contact");
                    System.out.println("press 2 to display in contact1");
                    System.out.println("press 3 to display in contact2");
                    int num=sc.nextInt();
                    if(num==1){
                        System.out.println("display in contact dictionary");
                        edit(contact);
                    }
                    else if(num==2){
                        edit(contact1);
                        System.out.println("display in contact1 dictionary");
                    }
                    else if(num==3){
                        edit(contact2);
                        System.out.println("display in contact2 dictionary");
                    }

                    break;
                case 3:
                    System.out.println("choose your below dictionary which you want to display ");
                    System.out.println("press 1 to display in contact");
                    System.out.println("press 2 to display in contact1");
                    System.out.println("press 3 to display in contact2");
                    int dis=sc.nextInt();
                    if(dis==1){
                        System.out.println("display in contact dictionary");
                        display(contact);
                    }
                    else if(dis==2){
                        display(contact1);
                        System.out.println("display in contact1 dictionary");
                    }
                    else if(dis==3){
                        display(contact2);
                        System.out.println("display in contact2 dictionary");
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter name u wont to be edit");
                        String num = scan.nextLine();
                        scan.nextLine();
                        System.out.println("Enter new name ");
                        String newName = scan.nextLine();
                        for (int i = 0; i < contact.size(); i++) {
                            if (contact.get(i).getName().equals(num)) {
                                t
                                contact.set(i, new Data(newName, contact.get(i).getSurName(), contact.get(i).getAddress(), contact.get(i).getCity(),
                                        contact.get(i).getState(), contact.get(i).getContactNumber(), contact.get(i).getZip(), contact.get(i).getGmail()));
                            }
                        }
                        break;
                        case 3:
                            for (int i = 0; i < contact.size(); i++) {
                                System.out.println(contact.get(i).getName() + " " + contact.get(i).getSurName() + " " + contact.get(i).getAddress()
                                        + " " + contact.get(i).getCity() + " " + contact.get(i).getState() + " " + contact.get(i).getContactNumber() +
                                        " " + contact.get(i).getZip() + " " + contact.get(i).getGmail());
                            }
                            break;
                        case 4:
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Enter name you wont to be delete");
                            String number = scanner.nextLine();
                            scanner.nextLine();
                            for( int k = 0;k<contact.size();k++ ){
                                if(contact.get(k).getName().equals(number)){
                                    contact.remove(contact.get(k));
                                }
                            }
                            break;
                    }


            }
        }

        break;
    }

}

        }
                }
static ArrayList dictionary(ArrayList arr){
        System.out.print(" Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Surname: ");
        String surName = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("ContactNumber: ");
        String contactNumber = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        arr.add(new Data(name, surName, address, city, state, contactNumber, zip, email));
        masterAddressBook.add(arr);
        return arr;
        }
public static void display(ArrayList<Data> arr){
        for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i).getName() + " " + arr.get(i).getSurName() + " " + arr.get(i).getAddress()
        + " " + arr.get(i).getCity() + " " + arr.get(i).getState() + " " + arr.get(i).getContactNumber() +
        " " + arr.get(i).getZip() + " " + arr.get(i).getGmail());

        }
        }

public static void edit(ArrayList<Data> arr){

        System.out.println("Enter name u wont to be edit");
        String num = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter new name ");
        String newName = sc.nextLine();


        for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i).getName().equals(num)) {

        arr.set(i, new Data(newName, arr.get(i).getSurName(), arr.get(i).getAddress(), arr.get(i).getCity(),
        arr.get(i).getState(), arr.get(i).getContactNumber(), arr.get(i).getZip(), arr.get(i).getGmail()));
        }
        }

        }
        }

        }
        }
}


public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book system");
        AddressBookMain obj = new AddressBookMain();
        obj.setName("joseph");
        obj.setSurname("xaviour");
        obj.setAddress("prestige neptune courtyard, marine drive");
        obj.setCity("cochin");
        obj.setState("kerala");
        obj.setContactNumber("8113090698");
        obj.setEmail("bhebhwebf@gmail.com");

        System.out.println("Name: " + obj.getName());
        System.out.println("Surname: " + obj.getSurname());
        System.out.println("Address: " + obj.getAddress());
        System.out.println("City: " + obj.getCity());
        System.out.println("State: " + obj.getState());
        System.out.println("ContactNumber: " + obj.getContactNumber());
        System.out.println("Email: " + obj.getEmail());


    }
}


public class AddressBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookMain addBook = new AddressBookMain();
        String start = "start";

        System.out.println("Welcome to Address Book system");
        while(start.equals("start")){
            System.out.println("to add address press 1, to display address press 2");
            int choice = sc.nextInt();
            if(choice==1)
                addBook.saveAddress();
            else if (choice==2)
                addBook.showMyAddress();
            else
                System.out.println("invalid option entered ");
        }

    }
}

public class AddressBook {

    public static void main(String[] args) {
        int choice = 10, count = 0;
        System.out.println("Welcome to AddressBook");
        AddressBook add = new AddressBook();
        Scanner sc = new Scanner(System.in);
        ArrayList<Data> contact = new ArrayList<Data>();
        while (choice != 0) {
            System.out.println("select the options from below ");
            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add contact. ");
            System.out.println(" 2. Edit contact. ");
            System.out.println(" 3. Output all contacts. ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print(" Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Surname: ");
                    String surName = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("ContactNumber: ");
                    String contactNumber = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    contact.add(new Data(name, surName, address, city, state, contactNumber, zip, email));
                    break;
                case 2:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter the name to be edited");
                    String num = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Enter new name ");
                    String newName = scan.nextLine();
                    for (int i = 0; i < contact.size(); i++) {
                        if (contact.get(i).getName().equals(num)) {

                            contact.set(i, new Data(newName, contact.get(i).getSurName(), contact.get(i).getAddress(), contact.get(i).getCity(),
                                    contact.get(i).getState(), contact.get(i).getContactNumber(), contact.get(i).getZip(), contact.get(i).getGmail()));
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < contact.size(); i++) {
                        System.out.println(contact.get(i).getName() + " " + contact.get(i).getSurName() + " " + contact.get(i).getAddress()
                                + " " + contact.get(i).getCity() + " " + contact.get(i).getState() + " " + contact.get(i).getContactNumber() +
                                " " + contact.get(i).getZip() + " " + contact.get(i).getGmail());
                        break;
                    }

            }


        }
    }
}



public class AddressBook {


    public static void main(String[] args) {

        public static void main(String[] args) {

            int choice = 10, count = 0;
            System.out.println("Welcome tp AddressBook system");
            AddressBook add = new AddressBook();
            Scanner sc = new Scanner(System.in);
            ArrayList<Data> contact = new ArrayList<Data>();
            while (choice != 0) {
                System.out.println("Press bellow option");
                System.out.println(" 0. Exit. ");
                System.out.println(" 1. Add contact. ");
                System.out.println(" 2. Edit contact. ");
                System.out.println(" 3. Display contacts");
                System.out.println(" 4. Delete contacts");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print(" Name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("Surname: ");
                        String surName = sc.nextLine();
                        System.out.print("Address: ");
                        String address = sc.nextLine();
                        System.out.print("City: ");
                        String city = sc.nextLine();
                        System.out.print("State: ");
                        String state = sc.nextLine();
                        System.out.print("ContactNumber: ");
                        String contactNumber = sc.nextLine();
                        System.out.print("Zip: ");
                        String zip = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        contact.add(new Data(name, surName, address, city, state, contactNumber, zip, email));
                        break;
                    case 2:
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter name u wont to be edit");
                        String num = scan.nextLine();
                        scan.nextLine();
                        System.out.println("Enter new name ");
                        String newName = scan.nextLine();
                        for (int i = 0; i < contact.size(); i++) {
                            if (contact.get(i).getName().equals(num)) {
                                t
                                contact.set(i, new Data(newName, contact.get(i).getSurName(), contact.get(i).getAddress(), contact.get(i).getCity(),
                                        contact.get(i).getState(), contact.get(i).getContactNumber(), contact.get(i).getZip(), contact.get(i).getGmail()));
                            }
                        }
                        break;
                    case 3:
                        for (int i = 0; i < contact.size(); i++) {
                            System.out.println(contact.get(i).getName() + " " + contact.get(i).getSurName() + " " + contact.get(i).getAddress()
                                    + " " + contact.get(i).getCity() + " " + contact.get(i).getState() + " " + contact.get(i).getContactNumber() +
                                    " " + contact.get(i).getZip() + " " + contact.get(i).getGmail());

                        }
                        break;
                    case 4:
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter name you wont to be delete");
                        String number = scanner.nextLine();
                        scanner.nextLine();
                        for( int k = 0;k<contact.size();k++ ){
                            if(contact.get(k).getName().equals(number)){
                                contact.remove(contact.get(k));
                            }
                        }
                        break;
                }


            }
        }

        break;
    }

}


        }
                }


                
                }
