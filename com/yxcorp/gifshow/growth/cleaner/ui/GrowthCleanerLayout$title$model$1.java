package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout$title$model$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout;
import java.lang.String;
import android.graphics.drawable.Drawable;
import msd.l;
import java.lang.Integer;
import gna.b$d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gna.b;
import gna.b$a;
import java.util.ArrayList;

public final class GrowthCleanerLayout$title$model$1 extends Lambda implements a	// class@001352
{
    public final String $description;
    public final Integer $descriptionColor;
    public final boolean $descriptionHtml;
    public final Drawable $icon;
    public final boolean $isExpanded;
    public final l $onSelect;
    public final String $subTitle;
    public final Integer $subTitleColor;
    public final boolean $subTitleHtml;
    public final String $title;
    public final GrowthCleanerLayout this$0;

    public void GrowthCleanerLayout$title$model$1(GrowthCleanerLayout p0,String p1,String p2,String p3,Drawable p4,l p5,Integer p6,boolean p7,Integer p8,boolean p9,boolean p10){
       this.this$0 = p0;
       this.$title = p1;
       this.$subTitle = p2;
       this.$description = p3;
       this.$icon = p4;
       this.$onSelect = p5;
       this.$subTitleColor = p6;
       this.$subTitleHtml = p7;
       this.$descriptionColor = p8;
       this.$descriptionHtml = p9;
       this.$isExpanded = p10;
       super(0);
    }
    public final b$d invoke(){
       Object obj = PatchProxy.apply(null, this, GrowthCleanerLayout$title$model$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b$d uod = new b$d(this.$title, this.$subTitle, this.$description, this.$icon, this.$onSelect);
       obj.r(this.$subTitleColor);
       obj.s(this.$subTitleHtml);
       obj.o(this.$descriptionColor);
       obj.p(this.$descriptionHtml);
       obj.D(this.$isExpanded);
       this.this$0.a.add(obj);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
