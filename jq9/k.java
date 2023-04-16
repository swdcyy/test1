package jq9.k;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.yxcorp.gifshow.corona.common.model.CoronaCoverInfo$TypeAdapter;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;

public class k implements KnownTypeAdapters$f	// class@002b4c
{
    public final CoronaCoverInfo$TypeAdapter a;

    public void k(CoronaCoverInfo$TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object[] a(int p0){
       CDNUrl[] uCDNUrlArray = new CDNUrl[p0];
       return uCDNUrlArray;
    }
}
