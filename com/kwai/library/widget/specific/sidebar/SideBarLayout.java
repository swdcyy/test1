package com.kwai.library.widget.specific.sidebar.SideBarLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import com.kwai.library.widget.specific.sidebar.SideBarLayout$a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.kwai.library.widget.specific.sidebar.SideBar;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.library.widget.specific.sidebar.SideBar$a;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.String;
import com.kwai.library.widget.specific.sidebar.SideBarLayout$b;

public class SideBarLayout extends RelativeLayout	// class@000a27
{
    public SideBarLayout$b b;
    public SideBar c;
    public TextView d;
    public ImageView e;
    public View f;
    public Map g;
    public SideBar$a h;

    public void SideBarLayout(Context p0){
       super(p0);
       this.h = new SideBarLayout$a(this);
       this.a(null);
    }
    public void SideBarLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = new SideBarLayout$a(this);
       this.a(p1);
    }
    public void SideBarLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = new SideBarLayout$a(this);
       this.a(p1);
    }
    public final void a(AttributeSet p0){
       View view = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d150d, this, true);
       this.c = view.findViewById(0x7f0a3963);
       this.d = view.findViewById(0x7f0a382d);
       this.f = view.findViewById(0x7f0a382c);
       this.e = view.findViewById(0x7f0a382b);
       this.c.setOnCurrentLetterListener(this.h);
       this.c.setAttributeSet(p0);
    }
    public void b(List p0,Map p1){
       this.g = new HashMap(p1);
       SideBarLayout tc = this.c;
       tc.d = p0;
       tc.g = true;
       tc.p.clear();
       tc.p.putAll(p1);
       tc.invalidate();
    }
    public void setCurrentLetter(String p0){
       this.c.setCurrentLetter(p0);
    }
    public void setOnLetterSelectedListener(SideBarLayout$b p0){
       this.b = p0;
    }
}
