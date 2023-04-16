package com.hhh.smartwidget.bubble.a$d;
import com.hhh.smartwidget.popup.c$a;
import android.app.Activity;
import com.hhh.smartwidget.popup.PopupInterface$Excluded;
import com.hhh.smartwidget.bubble.b;
import com.hhh.smartwidget.bubble.c;
import com.hhh.smartwidget.bubble.BubbleInterface$Position;
import com.hhh.smartwidget.a;
import com.hhh.smartwidget.popup.c;
import com.hhh.smartwidget.bubble.a;

public class a$d extends c$a	// class@00057b
{
    public CharSequence A;
    public BubbleInterface$Position B;
    public c C;
    public int D;
    public List E;
    public RecyclerView$Adapter F;
    public RecyclerView$LayoutManager G;
    public d H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public a y;
    public View z;

    public void a$d(Activity p0){
       super(p0);
       this.I = true;
       this.r = "popup_type_bubble";
       this.s = PopupInterface$Excluded.SAME_TYPE;
       this.w = b.a;
       this.x = c.a;
       this.B = BubbleInterface$Position.TOP;
       this.J = a.a(15.00f);
    }
    public c a(){
       a uoa = new a(this);
       this.y = uoa;
       return uoa;
    }
}
