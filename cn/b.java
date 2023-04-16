package cn.b;
import zm.a;
import android.widget.TextView;
import java.lang.Object;
import java.lang.CharSequence;
import brd.y;
import cn.b$a;
import crd.b;
import android.text.TextWatcher;

public final class b extends a	// class@00031d
{
    public final TextView b;

    public void b(TextView p0){
       super();
       this.b = p0;
    }
    public Object b(){
       return this.b.getText();
    }
    public void c(y p0){
       b$a uoa = new b$a(this.b, p0);
       p0.onSubscribe(uoa);
       this.b.addTextChangedListener(uoa);
    }
}
