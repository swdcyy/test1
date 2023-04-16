package com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class LiveProfileMode extends Enum	// class@000db8
{
    public static final LiveProfileMode[] $VALUES;
    public static final LiveProfileMode ADMIN_VIEW_AUDIENCE;
    public static final LiveProfileMode ANCHOR_VIEW_AUDIENCE;
    public static final LiveProfileMode ANCHOR_VIEW_SELF;
    public static final LiveProfileMode AUDIENCE_VIEW_ANCHOR;
    public static final LiveProfileMode AUDIENCE_VIEW_AUDIENCE;
    public static final LiveProfileMode AUDIENCE_VIEW_SELF;
    public static final LiveProfileMode ESCROW_VIEW_AUDIENCE;
    public static final LiveProfileMode ESCROW_VIEW_SELF;
    public static final LiveProfileMode LITE_AUDIENCE_VIEW_OTHERS;
    public static final LiveProfileMode LITE_SPECIAL_ROLE;
    public static final LiveProfileMode SPECIAL_ROLE;

    static {
       LiveProfileMode liveProfileM = new LiveProfileMode("AUDIENCE_VIEW_ANCHOR", 0);
       LiveProfileMode.AUDIENCE_VIEW_ANCHOR = liveProfileM;
       LiveProfileMode liveProfileM1 = new LiveProfileMode("AUDIENCE_VIEW_AUDIENCE", 1);
       LiveProfileMode.AUDIENCE_VIEW_AUDIENCE = liveProfileM1;
       LiveProfileMode liveProfileM2 = new LiveProfileMode("AUDIENCE_VIEW_SELF", 2);
       LiveProfileMode.AUDIENCE_VIEW_SELF = liveProfileM2;
       LiveProfileMode liveProfileM3 = new LiveProfileMode("ANCHOR_VIEW_SELF", 3);
       LiveProfileMode.ANCHOR_VIEW_SELF = liveProfileM3;
       LiveProfileMode liveProfileM4 = new LiveProfileMode("ANCHOR_VIEW_AUDIENCE", 4);
       LiveProfileMode.ANCHOR_VIEW_AUDIENCE = liveProfileM4;
       LiveProfileMode liveProfileM5 = new LiveProfileMode("ESCROW_VIEW_SELF", 5);
       LiveProfileMode.ESCROW_VIEW_SELF = liveProfileM5;
       LiveProfileMode liveProfileM6 = new LiveProfileMode("ESCROW_VIEW_AUDIENCE", 6);
       LiveProfileMode.ESCROW_VIEW_AUDIENCE = liveProfileM6;
       LiveProfileMode liveProfileM7 = new LiveProfileMode("SPECIAL_ROLE", 7);
       LiveProfileMode.SPECIAL_ROLE = liveProfileM7;
       LiveProfileMode liveProfileM8 = new LiveProfileMode("ADMIN_VIEW_AUDIENCE", 8);
       LiveProfileMode.ADMIN_VIEW_AUDIENCE = liveProfileM8;
       LiveProfileMode liveProfileM9 = new LiveProfileMode("LITE_AUDIENCE_VIEW_OTHERS", 9);
       LiveProfileMode.LITE_AUDIENCE_VIEW_OTHERS = liveProfileM9;
       LiveProfileMode liveProfileM10 = new LiveProfileMode("LITE_SPECIAL_ROLE", 10);
       LiveProfileMode.LITE_SPECIAL_ROLE = liveProfileM10;
       LiveProfileMode[] liveProfileM11 = new LiveProfileMode[11];
       liveProfileM11[0] = liveProfileM;
       liveProfileM11[1] = liveProfileM1;
       liveProfileM11[2] = liveProfileM2;
       liveProfileM11[3] = liveProfileM3;
       liveProfileM11[4] = liveProfileM4;
       liveProfileM11[5] = liveProfileM5;
       liveProfileM11[6] = liveProfileM6;
       liveProfileM11[7] = liveProfileM7;
       liveProfileM11[8] = liveProfileM8;
       liveProfileM11[9] = liveProfileM9;
       liveProfileM11[10] = liveProfileM10;
       LiveProfileMode.$VALUES = liveProfileM11;
    }
    public void LiveProfileMode(String p0,int p1){
       super(p0, p1);
    }
    public static LiveProfileMode getProfileMode(boolean p0,boolean p1,String p2,String p3,boolean p4,boolean p5){
       LiveProfileMode aNCHOR_VIEW_;
       LiveProfileMode liveProfileM = LiveProfileMode.class;
       if (PatchProxy.isSupport(liveProfileM)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(p1),p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, liveProfileM, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p4) {
          return LiveProfileMode.SPECIAL_ROLE;
       }else {
          String id = QCurrentUser.me().getId();
          boolean b = TextUtils.equals(p2, p3);
          if (p0) {
             aNCHOR_VIEW_ = (b)? LiveProfileMode.ANCHOR_VIEW_SELF: LiveProfileMode.ANCHOR_VIEW_AUDIENCE;
             return aNCHOR_VIEW_;
          }else if(TextUtils.equals(p3, id)){
             return LiveProfileMode.AUDIENCE_VIEW_SELF;
          }else if(b){
             return LiveProfileMode.AUDIENCE_VIEW_ANCHOR;
          }else if(p1 && p5){
             aNCHOR_VIEW_ = LiveProfileMode.ADMIN_VIEW_AUDIENCE;
          }else {
             aNCHOR_VIEW_ = LiveProfileMode.AUDIENCE_VIEW_AUDIENCE;
          }
          return aNCHOR_VIEW_;
       }
    }
    public static LiveProfileMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveProfileMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveProfileMode.class, p0);
    }
    public static LiveProfileMode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveProfileMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveProfileMode.$VALUES.clone();
    }
}
