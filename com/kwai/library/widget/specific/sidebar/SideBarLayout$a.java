package com.kwai.library.widget.specific.sidebar.SideBarLayout$a;
import com.kwai.library.widget.specific.sidebar.SideBar$a;
import com.kwai.library.widget.specific.sidebar.SideBarLayout;
import java.lang.Object;
import android.widget.TextView;
import android.view.View;
import java.lang.String;
import com.kwai.library.widget.specific.sidebar.SideBarLayout$b;
import java.util.Objects;
import java.lang.Character;
import android.widget.RelativeLayout;
import java.util.Map;
import c27.a;
import android.widget.ImageView;
import java.lang.CharSequence;

public class SideBarLayout$a implements SideBar$a	// class@000a25
{
    public final SideBarLayout a;

    public void SideBarLayout$a(SideBarLayout p0){
       this.a = p0;
       super();
    }
    public void a(){
       this.a.d.setVisibility(8);
       this.a.f.setVisibility(8);
    }
    public void b(String p0,float p1){
       SideBarLayout$a uoa;
       float f1;
       SideBarLayout b = this.a.b;
       if (b != null) {
          b.a(p0);
       }
       Objects.requireNonNull(this.a);
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 < i) {
             if ((Character.toString(p0.charAt(i2))).matches("[\\u4E00-\\u9FA5]+")) {
                uoa = 1;
             label_002c :
                float f = 0;
                if (uoa) {
                   this.a.f.setVisibility(i1);
                   this.a.d.setVisibility(8);
                   p1 = p1 - (float)(this.a.f.getHeight() / 2);
                   if (p1 - f > 0) {
                      f1 = (float)(this.a.getHeight() - this.a.f.getHeight());
                      f = (p1 - f1 > 0)? f1: p1;
                   }
                label_0067 :
                   this.a.f.setY(f);
                   SideBarLayout g = this.a.g;
                   if (g != null && (g.containsKey(p0) && this.a.g.get(p0) != null)) {
                      SideBarLayout$a ta = this.a;
                      ta.e.setImageResource(ta.g.get(p0).c);
                      break ;
                   }
                }else {
                   this.a.d.setVisibility(i1);
                   this.a.f.setVisibility(8);
                   p1 = p1 - (float)(this.a.d.getHeight() / 2);
                   if (p1 - f > 0) {
                      f1 = (float)(this.a.getHeight() - this.a.d.getHeight());
                      f = (p1 - f1 > 0)? f1: p1;
                   }
                label_00cc :
                   this.a.d.setY(f);
                   this.a.d.setText(p0);
                   break ;
                }
                break ;
             }else {
                i2 = i2 + 1;
             }
          }else {
             uoa = null;
             goto label_002c ;
          }
       }
       return;
    }
}
