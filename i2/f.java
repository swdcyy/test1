package i2.f;
import android.text.method.KeyListener;
import java.lang.Object;
import android.view.View;
import android.text.Editable;
import android.view.KeyEvent;
import androidx.emoji.text.EmojiCompat;

public final class f implements KeyListener	// class@00216b
{
    public final KeyListener a;

    public void f(KeyListener p0){
       super();
       this.a = p0;
    }
    public void clearMetaKeyState(View p0,Editable p1,int p2){
       this.a.clearMetaKeyState(p0, p1, p2);
    }
    public int getInputType(){
       return this.a.getInputType();
    }
    public boolean onKeyDown(View p0,Editable p1,int p2,KeyEvent p3){
       boolean b = (EmojiCompat.handleOnKeyDown(p1, p2, p3) || this.a.onKeyDown(p0, p1, p2, p3))? true: false;
       return b;
    }
    public boolean onKeyOther(View p0,Editable p1,KeyEvent p2){
       return this.a.onKeyOther(p0, p1, p2);
    }
    public boolean onKeyUp(View p0,Editable p1,int p2,KeyEvent p3){
       return this.a.onKeyUp(p0, p1, p2, p3);
    }
}
