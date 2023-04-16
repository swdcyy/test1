package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GzoneCompetitionCorner;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class GameZoneModels$GzoneCompetitionCorner implements Serializable, a	// class@0012c3
{
    public CDNUrl[] mIcon;
    public String mId;
    public long mServerCornerId;
    public static final long serialVersionUID = 0x7561d388c39b46db;

    public void GameZoneModels$GzoneCompetitionCorner(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, GameZoneModels$GzoneCompetitionCorner.class, "1")) {
          return;
       }
       GameZoneModels$GzoneCompetitionCorner tmServerCorn = this.mServerCornerId;
       if (tmServerCorn) {
          this.mId = String.valueOf(tmServerCorn);
       }
       return;
    }
}
