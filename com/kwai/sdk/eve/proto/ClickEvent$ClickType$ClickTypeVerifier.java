package com.kwai.sdk.eve.proto.ClickEvent$ClickType$ClickTypeVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.sdk.eve.proto.ClickEvent$ClickType;

public final class ClickEvent$ClickType$ClickTypeVerifier implements Internal$EnumVerifier	// class@0015de
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       ClickEvent$ClickType$ClickTypeVerifier.INSTANCE = new ClickEvent$ClickType$ClickTypeVerifier();
    }
    public void ClickEvent$ClickType$ClickTypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (ClickEvent$ClickType.forNumber(p0) != null)? true: false;
       return b;
    }
}
