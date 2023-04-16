package a2.m$a;
import android.view.LayoutInflater$Factory2;
import a2.n;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.StringBuilder;
import java.lang.Class;

public class m$a implements LayoutInflater$Factory2	// class@00008a
{
    public final n b;

    public void m$a(n p0){
       super();
       this.b = p0;
    }
    public View onCreateView(View p0,String p1,Context p2,AttributeSet p3){
       return this.b.onCreateView(p0, p1, p2, p3);
    }
    public View onCreateView(String p0,Context p1,AttributeSet p2){
       return this.b.onCreateView(null, p0, p1, p2);
    }
    public String toString(){
       return m$a.class.getName()+"{"+this.b+"}";
    }
}
