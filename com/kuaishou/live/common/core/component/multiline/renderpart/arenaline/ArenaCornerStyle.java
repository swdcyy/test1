package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.ArenaCornerStyle;
import bld.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ArenaCornerStyle extends Enum implements c	// class@001500
{
    public final float bottomLeftRadius;
    public final float bottomRightRadius;
    public final float radius;
    public final float topLeftRadius;
    public final float topRightRadius;
    public static final ArenaCornerStyle[] $VALUES;
    public static final ArenaCornerStyle TL2_BL2;
    public static final ArenaCornerStyle TR2_BR2;

    static {
       ArenaCornerStyle uArenaCorner1;
       ArenaCornerStyle[] uArenaCorner = new ArenaCornerStyle[]{v9,uArenaCorner1};
       uArenaCorner1 = new ArenaCornerStyle("TL2_BL2", 0, 0, 2.00f, 0, 2.00f, 0);
       ArenaCornerStyle.TL2_BL2 = v9;
       ArenaCornerStyle uArenaCorner2 = new ArenaCornerStyle("TR2_BR2", 1, 0, 0, 2.00f, 0, 2.00f);
       ArenaCornerStyle.TR2_BR2 = uArenaCorner1;
       ArenaCornerStyle.$VALUES = uArenaCorner;
    }
    public void ArenaCornerStyle(String p0,int p1,float p2,float p3,float p4,float p5,float p6){
       super(p0, p1);
       this.radius = p2;
       this.topLeftRadius = p3;
       this.topRightRadius = p4;
       this.bottomLeftRadius = p5;
       this.bottomRightRadius = p6;
    }
    public static ArenaCornerStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ArenaCornerStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ArenaCornerStyle.class, p0);
    }
    public static ArenaCornerStyle[] values(){
       Object obj = PatchProxy.apply(null, null, ArenaCornerStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ArenaCornerStyle.$VALUES.clone();
    }
    public float getBottomLeftRadius(){
       return this.bottomLeftRadius;
    }
    public float getBottomRightRadius(){
       return this.bottomRightRadius;
    }
    public float getRadius(){
       return this.radius;
    }
    public float getTopLeftRadius(){
       return this.topLeftRadius;
    }
    public float getTopRightRadius(){
       return this.topRightRadius;
    }
}
