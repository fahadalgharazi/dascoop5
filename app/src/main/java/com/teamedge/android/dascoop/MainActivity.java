package com.teamedge.android.dascoop;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



/**
 * This app displays an order form to order ice cream.
 */
public class MainActivity extends Activity {
        int numberOfScoops = 0;
        boolean topping1 = false;
        boolean topping2 = false ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }

        /**
         * This method is called when the order button is clicked.
         */
        public void submitOrder(View view) {
                displayQuantity(numberOfScoops);
                displayPrice(numberOfScoops * 2);
                string orderMessage="Name:" + nameEditText.getText()+"\n"+"Add Fudge?"+topping1+"\n"+
                        "Add Crushed Oreos?"+topping2+"\n"+numberOfScoops+"\n"+"Total:$"+price;

                public void composeEmail(String[] addresses, String subject) {
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                        if (intent.resolveActivity(getPackageManager()) != null) {
                                startActivity(intent);
                        }
                }



        }


        /**
         * This method displays the given quantity value on the screen.
         */
        private void displayQuantity(int number) {
                TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
                quantityTextView.setText("" + number);
        }

        /**
         * This method displays the given price on the screen.
         */

        private int topping1(boolean){



        }
        private int topping2(boolean){



        }





        private void displayPrice(int number) {
                TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
                priceTextView.setText("$" + number);
        }


        public void increase(View view) {
                numberOfScoops = numberOfScoops + 1;
                displayQuantity(numberOfScoops);


        }


        public void decrease(View view) {
                numberOfScoops = numberOfScoops - 1;
                displayQuantity(numberOfScoops);


        }

        private int calculatePrice(boolean addFudge, boolean addCrushedOroes) {
                int price = numberOfScoops * 2;

                if (addFudge == true) {
                        price += 2;
                }


                if (addCrushedOroes == true) {
                        price += 2;
                }

                return price;
        }


























}