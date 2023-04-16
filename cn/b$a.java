package cn.b$a;
import android.text.TextWatcher;
import io.reactivex.android.a;
import android.widget.TextView;
import brd.y;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Object;

public final class b$a extends a implements TextWatcher	// class@00031c
{
    public final TextView c;
    public final y d;

    public void b$a(TextView p0,y p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public void a(){
       this.c.removeTextChangedListener(this);
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (!this.isDisposed()) {
          this.d.onNext(p0);
       }
       return;
    }
}
