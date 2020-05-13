package ai.walterszucsjudit.logikaland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PictureActivity extends AppCompatActivity {

    private static final String TAG = "PictureActivity";

    ImageButton dinButton[];

    Button back, ok, newGame, giveUp;

    TextView resultText;
    boolean endGame = false;

    int guessID = 0;
    int guess[];
    int generatedA, generatedB, generatedC;
    int matchNumber =0, foundNumber= 0;

    TextView foundText[], matchText[];
    int tipID = 0;

    ImageView dinTips[][];
    ImageView dinImgResult[];
    int resultImgSrc[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        dinButton = new ImageButton[9];
        dinButton[0] = (ImageButton) findViewById(R.id.din1);
        dinButton[1] = (ImageButton) findViewById(R.id.din2);
        dinButton[2] = (ImageButton) findViewById(R.id.din3);
        dinButton[3] = (ImageButton) findViewById(R.id.din4);
        dinButton[4] = (ImageButton) findViewById(R.id.din5);
        dinButton[5] = (ImageButton) findViewById(R.id.din6);
        dinButton[6] = (ImageButton) findViewById(R.id.din7);
        dinButton[7] = (ImageButton) findViewById(R.id.din8);
        dinButton[8] = (ImageButton) findViewById(R.id.din9);

        dinTips = new ImageView[10][3];
        dinTips[0][0] = (ImageView) findViewById(R.id.dinImg1);
        dinTips[0][1] = (ImageView) findViewById(R.id.dinImg2);
        dinTips[0][2] = (ImageView) findViewById(R.id.dinImg3);

        dinTips[1][0] = (ImageView) findViewById(R.id.dinImg4);
        dinTips[1][1] = (ImageView) findViewById(R.id.dinImg5);
        dinTips[1][2] = (ImageView) findViewById(R.id.dinImg6);

        dinTips[2][0] = (ImageView) findViewById(R.id.dinImg7);
        dinTips[2][1] = (ImageView) findViewById(R.id.dinImg8);
        dinTips[2][2] = (ImageView) findViewById(R.id.dinImg9);

        dinTips[3][0] = (ImageView) findViewById(R.id.dinImg10);
        dinTips[3][1] = (ImageView) findViewById(R.id.dinImg11);
        dinTips[3][2] = (ImageView) findViewById(R.id.dinImg12);

        dinTips[4][0] = (ImageView) findViewById(R.id.dinImg13);
        dinTips[4][1] = (ImageView) findViewById(R.id.dinImg14);
        dinTips[4][2] = (ImageView) findViewById(R.id.dinImg15);

        dinTips[5][0] = (ImageView) findViewById(R.id.dinImg16);
        dinTips[5][1] = (ImageView) findViewById(R.id.dinImg17);
        dinTips[5][2] = (ImageView) findViewById(R.id.dinImg18);

        dinTips[6][0] = (ImageView) findViewById(R.id.dinImg19);
        dinTips[6][1] = (ImageView) findViewById(R.id.dinImg20);
        dinTips[6][2] = (ImageView) findViewById(R.id.dinImg21);

        dinTips[7][0] = (ImageView) findViewById(R.id.dinImg22);
        dinTips[7][1] = (ImageView) findViewById(R.id.dinImg23);
        dinTips[7][2] = (ImageView) findViewById(R.id.dinImg24);

        dinTips[8][0] = (ImageView) findViewById(R.id.dinImg25);
        dinTips[8][1] = (ImageView) findViewById(R.id.dinImg26);
        dinTips[8][2] = (ImageView) findViewById(R.id.dinImg27);

        dinTips[9][0] = (ImageView) findViewById(R.id.dinImg28);
        dinTips[9][1] = (ImageView) findViewById(R.id.dinImg29);
        dinTips[9][2] = (ImageView) findViewById(R.id.dinImg30);

        resultText = (TextView) findViewById(R.id.result);

        dinImgResult = new ImageView[3];
        dinImgResult[0] = (ImageView) findViewById(R.id.dinImgResult1);
        dinImgResult[1] = (ImageView) findViewById(R.id.dinImgResult2);
        dinImgResult[2] = (ImageView) findViewById(R.id.dinImgResult3);

        resultImgSrc = new int[3];

        guess = new int[3];

        for (int i = 0; i < 3; i++) {
            guess[i] = 1;
        }

        back = (Button) findViewById(R.id.picBack);
        ok = (Button) findViewById(R.id.picOk);
        newGame = (Button) findViewById(R.id.newPicture);
        giveUp = (Button) findViewById(R.id.giveUpPic);

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


        dinButton[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 1;
                setResultImg(R.drawable.dinosaur1);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 2;
                setResultImg(R.drawable.dinosaur2);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 3;
                setResultImg(R.drawable.dinosaur4);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 4;
                setResultImg(R.drawable.dinosaur3);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 5;
                setResultImg(R.drawable.dinosaur5);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 6;
                setResultImg(R.drawable.dinosaur7);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 7;
                setResultImg(R.drawable.dinosaur6);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 8;
                setResultImg(R.drawable.dinosaur8);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
            }
        });

        dinButton[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess[guessID] = 9;
                setResultImg(R.drawable.dinosaur9);
                guessID++;
                if(guessID == 3) guessID = 0;
                dinImgResult[guessID].setBackgroundResource(R.drawable.border);
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

        giveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText("Próbáld újra!");
                endGame = true;
                openPopUp();
            }
        });

        generateNumber();

    }

    private void openPopUp() {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(PictureActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.popuppicture, null);

        ImageView showPic1 = (ImageView) mView.findViewById(R.id.showPic1);
        ImageView showPic2 = (ImageView) mView.findViewById(R.id.showPic2);
        ImageView showPic3 = (ImageView) mView.findViewById(R.id.showPic3);

        setShowImg(showPic1, generatedA);
        setShowImg(showPic2, generatedB);
        setShowImg(showPic3, generatedC);

        mBuilder.setView(mView);
        AlertDialog dialog = mBuilder.create();
        WindowManager.LayoutParams mAtt = dialog.getWindow().getAttributes();
        mAtt.y = -200;

        dialog.show();
    }

    void setShowImg(ImageView view, int id){
        switch(id) {
            case 1:
                view.setImageResource(R.drawable.dinosaur1);
                break;
            case 2:
                view.setImageResource(R.drawable.dinosaur2);
                break;
            case 3:
                view.setImageResource(R.drawable.dinosaur3);
                break;
            case 4:
                view.setImageResource(R.drawable.dinosaur4);
                break;
            case 5:
                view.setImageResource(R.drawable.dinosaur5);
                break;
            case 6:
                view.setImageResource(R.drawable.dinosaur6);
                break;
            case 7:
                view.setImageResource(R.drawable.dinosaur7);
                break;
            case 8:
                view.setImageResource(R.drawable.dinosaur8);
                break;
            case 9:
                view.setImageResource(R.drawable.dinosaur9);
                break;
        }
    }

    private void checkWin(){
        boolean res = false;
        Log.d("+w", matchNumber + "" );
        if(matchNumber == 3){
            for(int i = 0; i < 3; i++) {
                dinImgResult[i].setVisibility(View.INVISIBLE);
            }
            endGame = true;
            resultText.setText("NYERTÉL!");
            openPopUp();
            Log.d("+", "win" );
        } else if ( tipID >= 10) {
            for(int i = 0; i < 3; i++) {
                dinImgResult[i].setVisibility(View.INVISIBLE);
            }
            endGame = true;
            resultText.setText("Próbáld újra!");
            openPopUp();
        }
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

    private void setResultImg(int i) {
        dinImgResult[guessID].setImageResource(i);
        dinImgResult[guessID].setBackgroundResource(R.drawable.dummy);
        resultImgSrc[guessID] = i;
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
            dinTips[tipID][i].setImageResource(resultImgSrc[i]);
            //dinImgResult[i].setImageResource(R.drawable.dummy);
        }

        /*dinImgResult[guessID].setBackgroundResource(R.drawable.dummy);
        guessID = 0;
        dinImgResult[guessID].setBackgroundResource(R.drawable.border);*/

        tipID++;

        checkWin();

        foundNumber = 0;
        matchNumber = 0;
    }

    @Override
    public void finish() {
        super.finish();
    }
}
