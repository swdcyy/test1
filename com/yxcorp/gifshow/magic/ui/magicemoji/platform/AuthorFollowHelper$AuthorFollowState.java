package com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$AuthorFollowState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AuthorFollowHelper$AuthorFollowState extends Enum	// class@001bdf
{
    public final String stateName;
    public static final AuthorFollowHelper$AuthorFollowState[] $VALUES;
    public static final AuthorFollowHelper$AuthorFollowState AVAILABLE_TO_FOLLOW;
    public static final AuthorFollowHelper$AuthorFollowState FOLLOWED;
    public static final AuthorFollowHelper$AuthorFollowState FOLLOWING;
    public static final AuthorFollowHelper$AuthorFollowState NOT_AVAILABLE;
    public static final AuthorFollowHelper$AuthorFollowState RECOVER_TO_AVAILABLE_TO_FOLLOW;

    static {
       AuthorFollowHelper$AuthorFollowState uAuthorFollo1;
       AuthorFollowHelper$AuthorFollowState[] uAuthorFollo = new AuthorFollowHelper$AuthorFollowState[]{uAuthorFollo1,uAuthorFollo1,uAuthorFollo1,uAuthorFollo1,uAuthorFollo1};
       uAuthorFollo1 = new AuthorFollowHelper$AuthorFollowState("NOT_AVAILABLE", 0, "NOT_AVAILABLE");
       AuthorFollowHelper$AuthorFollowState.NOT_AVAILABLE = uAuthorFollo1;
       uAuthorFollo1 = new AuthorFollowHelper$AuthorFollowState("AVAILABLE_TO_FOLLOW", 1, "AVAILABLE_TO_FOLLOW");
       AuthorFollowHelper$AuthorFollowState.AVAILABLE_TO_FOLLOW = uAuthorFollo1;
       uAuthorFollo1 = new AuthorFollowHelper$AuthorFollowState("FOLLOWING", 2, "FOLLOWING");
       AuthorFollowHelper$AuthorFollowState.FOLLOWING = uAuthorFollo1;
       uAuthorFollo1 = new AuthorFollowHelper$AuthorFollowState("FOLLOWED", 3, "FOLLOWED");
       AuthorFollowHelper$AuthorFollowState.FOLLOWED = uAuthorFollo1;
       uAuthorFollo1 = new AuthorFollowHelper$AuthorFollowState("RECOVER_TO_AVAILABLE_TO_FOLLOW", 4, "RECOVER_TO_AVAILABLE_TO_FOLLOW");
       AuthorFollowHelper$AuthorFollowState.RECOVER_TO_AVAILABLE_TO_FOLLOW = uAuthorFollo1;
       AuthorFollowHelper$AuthorFollowState.$VALUES = uAuthorFollo;
    }
    public void AuthorFollowHelper$AuthorFollowState(String p0,int p1,String p2){
       super(p0, p1);
       this.stateName = p2;
    }
    public static AuthorFollowHelper$AuthorFollowState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AuthorFollowHelper$AuthorFollowState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AuthorFollowHelper$AuthorFollowState.class, p0);
    }
    public static AuthorFollowHelper$AuthorFollowState[] values(){
       Object obj = PatchProxy.apply(null, null, AuthorFollowHelper$AuthorFollowState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AuthorFollowHelper$AuthorFollowState.$VALUES.clone();
    }
    public final String getStateName(){
       return this.stateName;
    }
}
