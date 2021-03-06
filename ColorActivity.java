package ai.kleszonekantortimea.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

   public class ColorActivity extends AppCompatActivity {

        private static final String TAG = "PictureActivity";

        Button colorButton[];

        Button back, ok, newGame;

        TextView resultText;
        boolean endGame = false;

        int guessID = 0;
        int guess[];
        int generatedA, generatedB, generatedC;
        int matchNumber =0, foundNumber= 0;

        TextView foundText[], matchText[];
        int tipID = 0;

        ImageView colorTips[][];
        ImageView colorResult[];
        int resultColor[];

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_color);

            colorButton = new Button[9];
            colorButton[0] = (Button) findViewById(R.id.colButton1);
            colorButton[1] = (Button) findViewById(R.id.colButton2);
            colorButton[2] = (Button) findViewById(R.id.colButton3);
            colorButton[3] = (Button) findViewById(R.id.colButton4);
            colorButton[4] = (Button) findViewById(R.id.colButton5);
            colorButton[5] = (Button) findViewById(R.id.colButton6);
            colorButton[6] = (Button) findViewById(R.id.colButton7);
            colorButton[7] = (Button) findViewById(R.id.colButton8);
            colorButton[8] = (Button) findViewById(R.id.colButton9);

            colorTips = new ImageView[10][3];
            colorTips[0][0] = (ImageView) findViewById(R.id.color1);
            colorTips[0][1] = (ImageView) findViewById(R.id.color2);
            colorTips[0][2] = (ImageView) findViewById(R.id.color3);

            colorTips[1][0] = (ImageView) findViewById(R.id.color4);
            colorTips[1][1] = (ImageView) findViewById(R.id.color5);
            colorTips[1][2] = (ImageView) findViewById(R.id.color6);

            colorTips[2][0] = (ImageView) findViewById(R.id.color7);
            colorTips[2][1] = (ImageView) findViewById(R.id.color8);
            colorTips[2][2] = (ImageView) findViewById(R.id.color9);

            colorTips[3][0] = (ImageView) findViewById(R.id.color10);
            colorTips[3][1] = (ImageView) findViewById(R.id.color11);
            colorTips[3][2] = (ImageView) findViewById(R.id.color12);

            colorTips[4][0] = (ImageView) findViewById(R.id.color13);
            colorTips[4][1] = (ImageView) findViewById(R.id.color14);
            colorTips[4][2] = (ImageView) findViewById(R.id.color15);

            colorTips[5][0] = (ImageView) findViewById(R.id.color16);
            colorTips[5][1] = (ImageView) findViewById(R.id.color17);
            colorTips[5][2] = (ImageView) findViewById(R.id.color18);

            colorTips[6][0] = (ImageView) findViewById(R.id.color19);
            colorTips[6][1] = (ImageView) findViewById(R.id.color20);
            colorTips[6][2] = (ImageView) findViewById(R.id.color21);

            colorTips[7][0] = (ImageView) findViewById(R.id.color22);
            colorTips[7][1] = (ImageView) findViewById(R.id.color23);
            colorTips[7][2] = (ImageView) findViewById(R.id.color24);

            colorTips[8][0] = (ImageView) findViewById(R.id.color25);
            colorTips[8][1] = (ImageView) findViewById(R.id.color26);
            colorTips[8][2] = (ImageView) findViewById(R.id.color27);

            colorTips[9][0] = (ImageView) findViewById(R.id.color28);
            colorTips[9][1] = (ImageView) findViewById(R.id.color29);
            colorTips[9][2] = (ImageView) findViewById(R.id.color30);

            resultText = (TextView) findViewById(R.id.result);

            colorResult = new ImageView[3];
            colorResult[0] = (ImageView) findViewById(R.id.colorResult1);
            colorResult[1] = (ImageView) findViewById(R.id.colorResult2);
            colorResult[2] = (ImageView) findViewById(R.id.colorResult3);

            resultColor = new int[3];

            guess = new int[3];

            for (int i = 0; i < 3; i++) {
                guess[i] = 1;
            }

            back = (Button) findViewById(R.id.colBack);
            ok = (Button) findViewById(R.id.colOk);
            newGame = (Button) findViewById(R.id.newColor);

            foundText = new TextView[10];
            foundText[0]  = (TextView)findViewById(R.id.found1);
            foundText[1]  = (TextView)findViewById(R.id.found2);
            foundText[2]  = (TextView)findViewById(R.id.found3);
            foundText[3]  = (TextView)findViewById(R.id.found4);
            foundText[4]  = (TextView)findViewById(R.id.found5);
            foundText[5]  = (TextView)findViewById(R.id.found6);
            foundText[6]  = (TextView)findViewById(R.id.found7);
            foundText[7]  = (TextView)findViewById(R.id.found8);
            foundText[8]  = (TextView)findViewById(R.id.found9);
            foundText[9]  = (TextView)findViewById(R.id.found10);


            matchText = new TextView[10];
            matchText[0] = (TextView)findViewById(R.id.match1);
            matchText[1] = (TextView)findViewById(R.id.match2);
            matchText[2] = (TextView)findViewById(R.id.match3);
            matchText[3] = (TextView)findViewById(R.id.match4);
            matchText[4] = (TextView)findViewById(R.id.match5);
            matchText[5] = (TextView)findViewById(R.id.match6);
            matchText[6] = (TextView)findViewById(R.id.match7);
            matchText[7] = (TextView)findViewById(R.id.match8);
            matchText[8] = (TextView)findViewById(R.id.match9);
            matchText[9] = (TextView)findViewById(R.id.match10);


            colorButton[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 1;
                    setResultColor(Color.rgb(76,175,80));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 2;
                    setResultColor(Color.rgb(255,193,7));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[2].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 3;
                    setResultColor(Color.rgb(235,7,7));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[3].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 4;
                    setResultColor(Color.rgb(244,67,54));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[4].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 5;
                    setResultColor(Color.rgb(3,169,244));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[5].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 6;
                    setResultColor(Color.rgb(103,58,183));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[6].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 7;
                    setResultColor(Color.rgb(233,30,99));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[7].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 8;
                    setResultColor(Color.rgb(219,93,27));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            colorButton[8].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    guess[guessID] = 9;
                    setResultColor(Color.rgb(7,235,235));
                    guessID++;
                    if(guessID == 3) guessID = 0;
                    colorResult[guessID].setImageResource(R.drawable.border);
                }
            });

            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(endGame) return;
                    checkNumber();
                }
            });

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

            newGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });

            generateNumber();

        }
        private boolean checkWin(){
            boolean res = false;
            Log.d("+w", matchNumber + "" );
            if(matchNumber == 3){
                for(int i = 0; i < 3; i++) {
                    colorResult[i].setVisibility(View.INVISIBLE);
                }
                res = true;
                endGame = true;
                resultText.setText("YOU WIN!");
                Log.d("+", "win" );
            }
            return res;
        }
        private void generateNumber() {
            Random r = new Random();
            generatedA = r.nextInt(9) + 1;
            generatedB = r.nextInt(9) + 1;
            generatedC = r.nextInt(9) + 1;

            Log.d("1: ", "w1 : " + generatedA );
            Log.d("2: ", "w2 : " + generatedB );
            Log.d("3: ", "w2 : " + generatedC );
        }

        private void setResultColor(int i) {
            colorResult[guessID].setBackgroundColor(i);
            colorResult[guessID].setImageResource(R.drawable.dummy);
            resultColor[guessID] = i;
        }

        private void checkNumber(){

            for(int i = 0; i < 3; i ++){
                if (guess[i] == generatedA || guess[i] == generatedB || guess[i] == generatedC) foundNumber++ ;
            }
            foundText[tipID].setText(foundNumber + "");

            if (guess[0] == generatedA) {
                matchNumber++;
            }
            if (guess[1] == generatedB) {
                matchNumber++;
            }
            if (guess[2] == generatedC) {
                matchNumber++;
            }
            Log.d("match", matchNumber + "");
            matchText[tipID].setText(matchNumber + "");

            for(int i = 0; i < 3; i++){
                colorTips[tipID][i].setBackgroundColor(resultColor[i]);
            }
            colorResult[guessID].setImageResource(R.drawable.dummy);
            guessID = 0;
            colorResult[guessID].setImageResource(R.drawable.border);

            tipID++;

            boolean win = checkWin();
            if ( tipID >= 10 || win ) {
                endGame = true;
            }

            foundNumber = 0;
            matchNumber = 0;
        }

        @Override
        public void finish() {
            super.finish();
        }
    }
    }
}
