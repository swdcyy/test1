package com.yxcorp.gifshow.widget.m0;
import java.lang.Object;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class m0	// class@001994
{
    public Pattern a;
    public boolean b;
    public Drawable c;
    public int d;
    public int e;
    public List f;

    public void m0(){
       super();
       this.a = Pattern.compile("\\${2}\\{\(\\d+\)\\|\([^\\$\(]+\)\\}\([^\\$]+\)\\${2}");
       this.f = new ArrayList();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, m0.class, "5")) {
          return;
       }
       this.f.clear();
       return;
    }
}
