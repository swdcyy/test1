package ok0.m$a;
import android.text.TextWatcher;
import ok0.n;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;

public class m$a implements TextWatcher	// class@003519
{
    public final MutableLiveData b;
    public final n c;

    public void m$a(n p0,MutableLiveData p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.b.setValue(p0);
    }
}
