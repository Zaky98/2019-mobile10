package id.ac.polinema.skorbasket.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class SharedScore extends AndroidViewModel {


    private MutableLiveData<Integer> scoreHome;
    private MutableLiveData<Integer> scoreVisitor;
    private MutableLiveData<Boolean> winner;

    public SharedScore(@NonNull Application application) {
        super(application);
        scoreHome = new MutableLiveData<>();
        scoreVisitor = new MutableLiveData<>();
        winner = new MutableLiveData<>();
    }

    public MutableLiveData<Integer> getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(MutableLiveData<Integer> scoreHome) {
        this.scoreHome = scoreHome;
    }

    public MutableLiveData<Integer> getScoreVisitor() {
        return scoreVisitor;
    }

    public void setScoreVisitor(MutableLiveData<Integer> scoreVisitor) {
        this.scoreVisitor = scoreVisitor;
    }

    public MutableLiveData<Boolean> getWinner() {
        return winner;
    }

    public void setWinner(MutableLiveData<Boolean> winner) {
        this.winner = winner;
    }
}
