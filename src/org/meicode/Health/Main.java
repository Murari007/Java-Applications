package org.meicode.Health;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Patient patient = new Patient("Brad", 20,
                new Eye("Left Eye", "Short Sighted", "blue", true),
                new Eye("Right Eye", "Normal", "blue", true),
                new Stomach("Stomach", "PUD", false),
                new Heart("Heart", "Normal", 65),
                new Skin("Skin", "Burned", "White", 50));

        System.out.println("Name :" + patient.getName());
        System.out.println("Age :" + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish)
        {
            System.out.println("Choose an Organ :" +
                    "\n\t 1. LeftEye" +
                    "\n\t 2. RightEye" +
                    "\n\t 3. Stomach" +
                    "\n\t 4. Heart" +
                    "\n\t 5. Skin" +
                    "\n\t 6. Quit");

            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t 1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t 1.Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t 1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t 1.Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t 1.Digest");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().Digest();
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t 1. Change the Heart Rate");
                    if (scanner.nextInt() == 1) {
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setHeartRate(newHeartRate);
                        System.out.println("Heart rate changed to :" + patient.getHeart().getHeartRate());
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }

        }
    }
}