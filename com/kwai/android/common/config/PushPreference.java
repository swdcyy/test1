package com.kwai.android.common.config.PushPreference;
import com.kwai.android.common.config.BasePreference;
import com.kwai.android.common.bean.Channel;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.lib.interfacies.SpAdapter;
import com.kwai.android.common.config.PushConfigManager;
import usd.q;
import java.util.Date;
import android.content.SharedPreferences$Editor;

public final class PushPreference extends BasePreference	// class@000988
{
    public static final PushPreference INSTANCE;

    static {
       PushPreference.INSTANCE = new PushPreference();
    }
    public void PushPreference(){
       super();
    }
    public static final String getChannelToken(Channel p0){
       a.p(p0, "channel");
       return SpAdapter.b.getString(PushPreference.INSTANCE.keyRegisterToken(p0), null);
    }
    public static final long getChannelTokenRegisterPeriod(){
       return SpAdapter.b.getLong("register_period_in_msec", 0x1b7740);
    }
    public static final long getChannelTokenUpdateTime(Channel p0){
       a.p(p0, "channel");
       return SpAdapter.b.getLong(PushPreference.INSTANCE.keyRegisterTime(p0), 0);
    }
    public static final long getCombineBarrierMills(){
       return SpAdapter.b.getLong("combine_barrier_mills", PushConfigManager.INSTANCE.getCombineBarrierMills());
    }
    public static final int getCombineShowNum(){
       return q.n(SpAdapter.b.getInt("combine_show_num", PushConfigManager.INSTANCE.getCombineShowNum()), 0);
    }
    public static final Date getLastReportStateDate(){
       long l = 0;
       long longx = SpAdapter.b.getLong("report_date_in_msec", l);
       Date uDate = (!longx - l)? null: new Date(longx);
       return uDate;
    }
    public static final void setChannelToken(Channel p0,String p1){
       a.p(p0, "channel");
       a.p(p1, "token");
       SpAdapter.b.putString(PushPreference.INSTANCE.keyRegisterToken(p0), p1);
    }
    public static final void setChannelTokenRegisterPeriod(long p0){
       SpAdapter.b.putLong("register_period_in_msec", p0);
    }
    public static final void setChannelTokenUpdateTime(Channel p0,long p1){
       a.p(p0, "channel");
       SpAdapter.b.putLong(PushPreference.INSTANCE.keyRegisterTime(p0), p1);
    }
    public static final void setCombineBarrierMills(long p0){
       SpAdapter.b.putLong("combine_barrier_mills", p0);
    }
    public static final void setCombineShowNum(int p0){
       SpAdapter.b.putInt("combine_show_num", q.n(p0, 0));
    }
    public static final void setLastReportDate(Date p0){
       a.p(p0, "reportDate");
       SpAdapter.b.putLong("report_date_in_msec", p0.getTime());
    }
}
