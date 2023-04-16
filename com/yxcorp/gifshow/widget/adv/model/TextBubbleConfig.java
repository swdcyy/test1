package com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig$ScaleMode;
import android.graphics.Paint$Align;
import com.kuaishou.edit.draft.FeatureId;
import com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig$a;
import com.yxcorp.gifshow.widget.adv.util.TextLayoutHelper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class TextBubbleConfig	// class@001928
{
    public int A;
    public int B;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Paint$Align f;
    public int[] g;
    public int h;
    public int i;
    public float j;
    public float k;
    public int l;
    public FeatureId m;
    public int n;
    public String o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public TextBubbleConfig$ScaleMode w;
    public int x;
    public int y;
    public boolean z;
    public static String C = "kuang_18";
    public static String D = "kuang_19";

    public void TextBubbleConfig(){
       super();
       this.b = 0;
       this.c = 0;
       this.i = Integer.MAX_VALUE;
       this.n = 17;
       this.q = true;
       this.s = 0;
       this.u = 0;
       this.v = 0;
       this.x = 0;
    }
    public void TextBubbleConfig(int p0,int p1,int p2,int p3,int p4,int p5,int p6,boolean p7,String p8,TextBubbleConfig$ScaleMode p9,int[] p10,int p11,int p12,int p13,int p14,int p15,float p16,float p17,int p18,boolean p19,int p20,int p21,int p22,Paint$Align p23,int p24,int p25,FeatureId p26,int p27,TextBubbleConfig$a p28){
       TextBubbleConfig textBubbleCo = this;
       int i = p3;
       boolean b = p7;
       super();
       textBubbleCo.b = 0;
       textBubbleCo.c = 0;
       textBubbleCo.i = Integer.MAX_VALUE;
       textBubbleCo.n = 17;
       textBubbleCo.q = true;
       textBubbleCo.s = 0;
       textBubbleCo.u = 0;
       textBubbleCo.v = 0;
       textBubbleCo.x = 0;
       textBubbleCo.a = p0;
       textBubbleCo.r = p1;
       textBubbleCo.p = p2;
       textBubbleCo.B = i;
       textBubbleCo.t = p4;
       textBubbleCo.u = p5;
       textBubbleCo.v = p6;
       textBubbleCo.z = b;
       textBubbleCo.o = p8;
       textBubbleCo.w = p9;
       textBubbleCo.g = p10;
       textBubbleCo.b = p11;
       textBubbleCo.x = p13;
       textBubbleCo.y = p14;
       textBubbleCo.l = p15;
       textBubbleCo.j = p16;
       textBubbleCo.k = p17;
       textBubbleCo.i = p18;
       textBubbleCo.q = p19;
       textBubbleCo.d = p20;
       textBubbleCo.e = p21;
       textBubbleCo.A = p22;
       textBubbleCo.f = p23;
       textBubbleCo.s = p24;
       textBubbleCo.h = p25;
       textBubbleCo.m = p26;
       textBubbleCo.n = p27;
       if (!b || (i <= 0 && !PatchProxy.applyVoidOneRefs(this, null, TextLayoutHelper.class, "16"))) {
          if (textBubbleCo.b == null) {
             i = (textBubbleCo.x == true || textBubbleCo.t != null)? TextLayoutHelper.M: TextLayoutHelper.L;
             textBubbleCo.b = (int)((float)i * TextLayoutHelper.a(textBubbleCo.B));
          }
          if (textBubbleCo.c == null && textBubbleCo.x != 3) {
             i = (textBubbleCo.t != null)? TextLayoutHelper.M: TextLayoutHelper.L;
             textBubbleCo.c = (int)((float)i * TextLayoutHelper.a(textBubbleCo.B));
          }
       }
    label_00cd :
       return;
    }
    public int[] a(){
       return this.g;
    }
    public int[] b(){
       int[] ointArray = new int[4];
       return ointArray;
    }
    public int c(){
       return this.p;
    }
    public TextBubbleConfig$ScaleMode d(){
       return this.w;
    }
    public int e(){
       return this.a;
    }
}
