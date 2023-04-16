package t7.d;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class d	// class@002473
{
    public final String mLegacyChannelId;
    public final String mNewChannelId;

    public final String a(){
       return this.mLegacyChannelId;
    }
    public final String b(){
       return this.mNewChannelId;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof d && (a.g(this.mLegacyChannelId, p0.mLegacyChannelId) && a.g(this.mNewChannelId, p0.mNewChannelId)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d tmLegacyChan = this.mLegacyChannelId;
       int i = 0;
       int i1 = (tmLegacyChan != null)? tmLegacyChan.hashCode(): 0;
       i1 = i1 * 31;
       d tmNewChannel = this.mNewChannelId;
       if (tmNewChannel != null) {
          i = tmNewChannel.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "MigrateStrategyInfo\(mLegacyChannelId="+this.mLegacyChannelId+", mNewChannelId="+this.mNewChannelId+"\)";
    }
}
