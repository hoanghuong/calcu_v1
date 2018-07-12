package com.example.hoang.calcu_v1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class calcuv1Fragment extends Fragment implements View.OnClickListener {
    private Button mButtonOne;
    private Button mButtonTwo;
    private Button mButtonThree;
    private Button mButtonFour;
    private Button mButtonFive;
    private Button mButtonSix;
    private Button mButtonSeven;
    private Button mButtonEight;
    private Button mButtonNine;
    private Button mButtonZero;
    private Button mButtonDog;
    private Button mButtonResult;
    private Button mButtonSum;
    private Button mButtonSubtraction;
    private Button mButtonDividion;
    private Button mButtonMult;
    private Button mButtonTypeNumber;
    private Button mButtonPercent;
    private Button mButtonAc;
    public static final String NUMBER_0 = "0";
    public static final String NUMBER_1 = "1";
    public static final String NUMBER_2 = "2";
    public static final String NUMBER_3 = "3";
    public static final String NUMBER_4 = "4";
    public static final String NUMBER_5 = "5";
    public static final String NUMBER_6 = "6";
    public static final String NUMBER_7 = "7";
    public static final String NUMBER_8 = "8";
    public static final String NUMBER_9 = "9";
    public static final String TYPENUMBER = "-";
    public static final String DOGS = ".";
    public static final String AC = "";
    private Float mNumberOne, mNumberTwo;
    private Float mResut;
    private int mCaseNumber = 0;
    private TextView mTextResutl;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calcuv1, container, false);
        addControl(v);
        addevent();
        return v;
    }

    private void addevent() {
        mButtonZero.setOnClickListener(this);
        mButtonOne.setOnClickListener(this);
        mButtonTwo.setOnClickListener(this);
        mButtonThree.setOnClickListener(this);
        mButtonFour.setOnClickListener(this);
        mButtonFive.setOnClickListener(this);
        mButtonSix.setOnClickListener(this);
        mButtonSeven.setOnClickListener(this);
        mButtonEight.setOnClickListener(this);
        mButtonNine.setOnClickListener(this);
        mButtonAc.setOnClickListener(this);
        mButtonTypeNumber.setOnClickListener(this);
        mButtonPercent.setOnClickListener(this);
        mButtonDividion.setOnClickListener(this);
        mButtonSubtraction.setOnClickListener(this);
        mButtonSum.setOnClickListener(this);
        mButtonMult.setOnClickListener(this);
        mButtonResult.setOnClickListener(this);
        mButtonDog.setOnClickListener(this);


    }

    private void addControl(View v) {
        mButtonZero = v.findViewById(R.id.button_0);
        mButtonOne = v.findViewById(R.id.button_1);
        mButtonTwo = v.findViewById(R.id.button_2);
        mButtonThree = v.findViewById(R.id.button_3);
        mButtonFour = v.findViewById(R.id.button_4);
        mButtonFive = v.findViewById(R.id.button_5);
        mButtonSix = v.findViewById(R.id.button_6);
        mButtonSeven = v.findViewById(R.id.button_7);
        mButtonEight = v.findViewById(R.id.button_8);
        mButtonNine = v.findViewById(R.id.button_9);
        mButtonDog = v.findViewById(R.id.button_dog);
        mButtonResult = v.findViewById(R.id.button_resutl);
        mButtonSubtraction = v.findViewById(R.id.button_subtraction);
        mButtonSum = v.findViewById(R.id.button_sum);
        mButtonDividion = v.findViewById(R.id.button_dividion);
        mButtonMult = v.findViewById(R.id.button_multip);
        mButtonTypeNumber = v.findViewById(R.id.button_typenumber);
        mButtonPercent = v.findViewById(R.id.button_percent);
        mButtonAc = v.findViewById(R.id.button_ac);
        mTextResutl = v.findViewById(R.id.text_resutl);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_0:
                mTextResutl.append(NUMBER_0);
                break;
            case R.id.button_1:
                mTextResutl.append(NUMBER_1);
                break;
            case R.id.button_2:
                mTextResutl.append(NUMBER_2);
                break;
            case R.id.button_3:
                mTextResutl.append(NUMBER_3);
                break;
            case R.id.button_4:
                mTextResutl.append(NUMBER_4);
                break;
            case R.id.button_5:
                mTextResutl.append(NUMBER_5);
                break;
            case R.id.button_6:
                mTextResutl.append(NUMBER_6);
                break;
            case R.id.button_7:
                mTextResutl.append(NUMBER_7);
                break;
            case R.id.button_8:
                mTextResutl.append(NUMBER_8);
                break;
            case R.id.button_9:
                mTextResutl.append(NUMBER_9);
                break;
            case R.id.button_sum:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mNumberOne = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mCaseNumber = 1;
                }

                break;
            case R.id.button_subtraction:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mNumberOne = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mCaseNumber = 2;
                }
                break;
            case R.id.button_dividion:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mNumberOne = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mCaseNumber = 3;
                }
                break;
            case R.id.button_multip:
                if (mTextResutl.getText().toString().equals("")) {
                } else {
                    mNumberOne = Float.parseFloat(mTextResutl.getText().toString());
                    mTextResutl.setText(AC);
                    mCaseNumber = 4;
                }
                break;
            case R.id.button_ac:
                mTextResutl.setText(AC);
                break;
            case R.id.button_typenumber:
                mTextResutl.append(TYPENUMBER);
                break;
            case R.id.button_percent:
                Float x = Float.parseFloat(mTextResutl.getText().toString());
                x = x / 100;
                mTextResutl.setText(String.valueOf(x));
                break;
            case R.id.button_dog:
                mTextResutl.append(DOGS);
                break;
            case R.id.button_resutl:
                if (mTextResutl.getText().toString().equals("")) {

                } else {
                    mNumberTwo = Float.parseFloat(mTextResutl.getText().toString());
                    switch (mCaseNumber) {
                        case 1:
                            mResut = mNumberOne + mNumberTwo;
                            break;

                        case 2:
                            mResut = mNumberOne - mNumberTwo;
                            break;

                        case 3:
                            mResut = mNumberOne / mNumberTwo;
                            break;

                        case 4:
                            mResut = mNumberOne * mNumberTwo;
                            break;
                        default:
                            break;
                    }
                    mTextResutl.setText(String.valueOf(mResut));
                }
                break;
            default:
                break;
        }
    }


}
