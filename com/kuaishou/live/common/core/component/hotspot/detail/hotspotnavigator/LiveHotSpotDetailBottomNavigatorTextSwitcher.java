package com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorTextSwitcher;
import android.widget.ViewSwitcher;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorTextSwitcher$b;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorTextSwitcher$a;
import android.widget.ViewSwitcher$ViewFactory;

public final class LiveHotSpotDetailBottomNavigatorTextSwitcher extends ViewSwitcher	// class@0013b0
{
    public HashMap b;
    public static final LiveHotSpotDetailBottomNavigatorTextSwitcher$b c;

    static {
       LiveHotSpotDetailBottomNavigatorTextSwitcher.c = new LiveHotSpotDetailBottomNavigatorTextSwitcher$b(null);
    }
    public void LiveHotSpotDetailBottomNavigatorTextSwitcher(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.setFactory(new LiveHotSpotDetailBottomNavigatorTextSwitcher$a(p0));
    }
}
