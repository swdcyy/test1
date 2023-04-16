package com.hhh.smartwidget.inputpanel.InputPanel$b;
import com.hhh.smartwidget.popup.c$a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.util.ArrayList;
import com.hhh.smartwidget.popup.PopupInterface$Excluded;
import com.hhh.smartwidget.inputpanel.InputPanel;
import com.hhh.smartwidget.inputpanel.a;
import com.hhh.smartwidget.popup.c;

public class InputPanel$b extends c$a	// class@000581
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public CharSequence L;
    public CharSequence M;
    public CharSequence N;
    public Drawable O;
    public Drawable P;
    public Drawable Q;
    public g R;
    public k S;
    public i T;
    public l U;
    public final List y;
    public int z;

    public void InputPanel$b(FragmentActivity p0){
       super(p0);
       this.y = new ArrayList();
       this.z = 1;
       this.B = 1;
       this.C = -1;
       this.E = -1;
       this.I = true;
       this.J = true;
       this.r = "popup_type_input";
       this.s = PopupInterface$Excluded.NOT_AGAINST;
       this.x = a.a;
    }
    public c a(){
       return new InputPanel(this);
    }
    public boolean m(){
       boolean b = (this.w != null)? true: false;
       return b;
    }
}
