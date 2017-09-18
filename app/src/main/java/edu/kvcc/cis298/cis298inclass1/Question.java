package edu.kvcc.cis298.cis298inclass1;

/**
 * Created by bdamaske2694 on 9/18/2017.
 */

public class Question {


    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue)
    {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResID() {
        return mTextResId;
    }

    public void setTextResID(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
