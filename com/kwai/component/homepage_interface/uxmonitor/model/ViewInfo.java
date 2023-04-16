package com.kwai.component.homepage_interface.uxmonitor.model.ViewInfo;
import java.lang.String;
import android.graphics.Rect;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.View;

public final class ViewInfo	// class@000982
{
    public View a;
    public final String id;
    public final int index;
    public final int level;
    public final String name;
    public final String parent;
    public final Rect region;

    public void ViewInfo(String p0,String p1,Rect p2,int p3,String p4,int p5){
       a.p(p0, "name");
       a.p(p1, "id");
       a.p(p4, "parent");
       super();
       this.name = p0;
       this.id = p1;
       this.region = p2;
       this.index = p3;
       this.parent = p4;
       this.level = p5;
    }
    public final Rect a(){
       return this.region;
    }
    public final void b(View p0){
       this.a = p0;
    }
}
