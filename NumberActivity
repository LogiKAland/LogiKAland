package ai.szrenkanelukacskinga.LogiKaland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import java.util.Random;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import java.util.Random;

public class NumberActivity extends AppCompatActivity {

    private static final String TAG = "NumberActivity";

    Button minus1, minus2, minus3,
            plus1, plus2, plus3;

    Button back, ok, newGame, giveUp;

    TextView number1, number2, number3;
    TextView resultText;

    int guess1 = 1, guess2 = 1,  guess3 = 1;
    int generatedA, generatedB, generatedC;
    int matchNumber =0, foundNumber= 0;

    TextView tips[], foundText[], matchText[];
    int tipID = 0;

    boolean endGame = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        minus1 = (Button) findViewById(R.id.minus1);
        minus2 = (Button) findViewById(R.id.minus2);
        minus3 = (Button) findViewById(R.id.minus3);

        plus1 = (Button) findViewById(R.id.plus1);
        plus2 = (Button) findViewById(R.id.plus2);
        plus3 = (Button) findViewById(R.id.plus3);

        number1 = (TextView)findViewById(R.id.number1);
        number2 = (TextView)findViewById(R.id.number2);
        number3 = (TextView)findViewById(R.id.number3);

        resultText = (TextView) findViewById(R.id.result);
        resultText.setText("111");

        back = (Button) findViewById(R.id.numBack);
        ok = (Button) findViewById(R.id.numOk);
        newGame = (Button) findViewById(R.id.newNumber);
        giveUp = (Button) findViewById(R.id.giveUpNum);

        tips = new TextView[10];
        tips[0] = (TextView)findViewById(R.id.tip1);
        tips[1] = (TextView)findViewById(R.id.tip2);
        tips[2] = (TextView)findViewById(R.id.tip3);
        tips[3] = (TextView)findViewById(R.id.tip4);
        tips[4] = (TextView)findViewById(R.id.tip5);
        tips[5] = (TextView)findViewById(R.id.tip6);
        tips[6] = (TextView)findViewById(R.id.tip7);
        tips[7] = (TextView)findViewById(R.id.tip8);
        tips[8] = (TextView)findViewById(R.id.tip9);
        tips[9] = (TextView)findViewById(R.id.tip10);

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


        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess1--;
                if (guess1 < 1) {
                    guess1 = 1;
                    return;
                }
                number1.setText(guess1 + "");
                resultText.setText(guess1 + "" + guess2 + "" + guess3);
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess2--;
                if (guess2 < 1) {
                    guess2 = 1;
                    return;
                }
                number2.setText(guess2 + "");
                resultText.setText(guess1 + "" + guess2 + "" + guess3);
            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess3--;
                if (guess3 < 1) {
                    guess3 = 1;
                    return;
                }
                number3.setText(guess3 + "");
                resultText.setText(guess1 + "" + guess2 + "" + guess3);
            }
        });

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess1++;
                if (guess1 > 9) {
                    guess1 = 9;
                    return;
                }
                number1.setText(guess1 + "");
                resultText.setText(guess1 + "" + guess2 + "" + guess3);
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess2++;
                if (guess2 > 9) {
                    guess2 = 9;
                    return;
                }
                number2.setText(guess2 + "");
                resultText.setText(guess1 + "" + guess2 + "" + guess3);
            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(endGame) return;
                guess3++;
                if (guess3 > 9) {
                    guess3 = 9;
                    return;
                }
                number3.setText(guess3 + "");
                resultText.setText(guess1 + "" + guess2 + "" + guess3);
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
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(NumberActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.popupnumber, null);

        TextView showNum = (TextView) mView.findViewById(R.id.showNumber);
        showNum.setText(generatedA + " " + generatedB + " " + generatedC);

        mBuilder.setView(mView);
        AlertDialog dialog = mBuilder.create();
        dialog.show();
    }

    private void checkWin(){
        boolean res = false;
        if(matchNumber == 3){
            endGame = true;
            resultText.setText("NYERTÉL!");
            openPopUp();
            Log.d("+", "win" );
        } else if ( tipID >= 10 ) {
            resultText.setText("Próbáld újra!");
            openPopUp();
            endGame = true;
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

    private void checkNumber(){

        //guessText.setText(guess1 + "" + guess2 + "" + guess3);

        tips[tipID].setText(guess1 + "" + guess2 + "" + guess3);

        foundNumber = 0;
        matchNumber = 0;

        if (guess1 == generatedA || guess1 == generatedB || guess1 == generatedC) {
            foundNumber++;
        }

        if (guess2 == generatedA || guess2 == generatedB || guess2 == generatedC) {
            foundNumber++;
        }

        if (guess3 == generatedA || guess3 == generatedB || guess3 == generatedC) {
            foundNumber++;
        }

        foundText[tipID].setText(foundNumber + "");

        if (guess1 == generatedA) {
            matchNumber++;
        }
        if (guess2 == generatedB) {
            matchNumber++;
        }
        if (guess3 == generatedC) {
            matchNumber++;
        }

        matchText[tipID].setText(matchNumber + "");

        tipID++;

        checkWin();
    }

    @Override
    public void finish() {
        super.finish();
    }
}

