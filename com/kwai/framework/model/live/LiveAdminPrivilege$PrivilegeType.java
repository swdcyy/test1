package com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAdminPrivilege$PrivilegeType extends Enum	// class@0016c0
{
    public static final LiveAdminPrivilege$PrivilegeType[] $VALUES;
    public static final LiveAdminPrivilege$PrivilegeType BLOCK;
    public static final LiveAdminPrivilege$PrivilegeType CONTROL;
    public static final LiveAdminPrivilege$PrivilegeType FORBID_COMMENT;
    public static final LiveAdminPrivilege$PrivilegeType KICK_USER;

    static {
       LiveAdminPrivilege$PrivilegeType privilegeTyp = new LiveAdminPrivilege$PrivilegeType("FORBID_COMMENT", 0);
       LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT = privilegeTyp;
       LiveAdminPrivilege$PrivilegeType privilegeTyp1 = new LiveAdminPrivilege$PrivilegeType("KICK_USER", 1);
       LiveAdminPrivilege$PrivilegeType.KICK_USER = privilegeTyp1;
       LiveAdminPrivilege$PrivilegeType privilegeTyp2 = new LiveAdminPrivilege$PrivilegeType("BLOCK", 2);
       LiveAdminPrivilege$PrivilegeType.BLOCK = privilegeTyp2;
       LiveAdminPrivilege$PrivilegeType privilegeTyp3 = new LiveAdminPrivilege$PrivilegeType("CONTROL", 3);
       LiveAdminPrivilege$PrivilegeType.CONTROL = privilegeTyp3;
       LiveAdminPrivilege$PrivilegeType[] privilegeTyp4 = new LiveAdminPrivilege$PrivilegeType[]{privilegeTyp,privilegeTyp1,privilegeTyp2,privilegeTyp3};
       LiveAdminPrivilege$PrivilegeType.$VALUES = privilegeTyp4;
    }
    public void LiveAdminPrivilege$PrivilegeType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAdminPrivilege$PrivilegeType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAdminPrivilege$PrivilegeType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAdminPrivilege$PrivilegeType.class, p0);
    }
    public static LiveAdminPrivilege$PrivilegeType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAdminPrivilege$PrivilegeType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAdminPrivilege$PrivilegeType.$VALUES.clone();
    }
}
