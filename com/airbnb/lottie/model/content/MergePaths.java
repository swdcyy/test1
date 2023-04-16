package com.airbnb.lottie.model.content.MergePaths;
import r5.b;
import java.lang.String;
import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;
import java.lang.Object;
import w4.h;
import com.airbnb.lottie.model.layer.a;
import y4.c;
import w4.d;
import y4.l;
import java.lang.StringBuilder;

public class MergePaths implements b	// class@000dc7
{
    public final String a;
    public final MergePaths$MergePathsMode b;
    public final boolean c;

    public void MergePaths(String p0,MergePaths$MergePathsMode p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public c a(h p0,a p1){
       if (p0.n != null) {
          return new l(this);
       }
       d.c("Animation contains merge paths but they are disabled.");
       return null;
    }
    public String b(){
       return this.a;
    }
    public String toString(){
       return "MergePaths{mode="+this.b+'}';
    }
}
