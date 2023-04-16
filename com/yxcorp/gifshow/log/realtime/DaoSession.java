package com.yxcorp.gifshow.log.realtime.DaoSession;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import java.util.Map;
import com.yxcorp.gifshow.log.realtime.RealShowDao;
import java.lang.Object;
import org.greenrobot.greendao.internal.DaoConfig;
import com.yxcorp.gifshow.log.realtime.CoverShowDao;
import com.yxcorp.gifshow.log.realtime.OperationDao;
import com.yxcorp.gifshow.log.realtime.CommentShowDao;
import com.yxcorp.gifshow.log.realtime.RealShow;
import java.lang.Class;
import org.greenrobot.greendao.AbstractDao;
import com.yxcorp.gifshow.log.realtime.CoverShow;
import com.yxcorp.gifshow.log.realtime.Operation;
import com.yxcorp.gifshow.log.realtime.CommentShow;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class DaoSession extends AbstractDaoSession	// class@001b33
{
    public final CommentShowDao commentShowDao;
    public final DaoConfig commentShowDaoConfig;
    public final CoverShowDao coverShowDao;
    public final DaoConfig coverShowDaoConfig;
    public final OperationDao operationDao;
    public final DaoConfig operationDaoConfig;
    public final RealShowDao realShowDao;
    public final DaoConfig realShowDaoConfig;

    public void DaoSession(Database p0,IdentityScopeType p1,Map p2){
       super(p0);
       DaoConfig uDaoConfig = p2.get(RealShowDao.class).clone();
       this.realShowDaoConfig = uDaoConfig;
       uDaoConfig.initIdentityScope(p1);
       DaoConfig uDaoConfig1 = p2.get(CoverShowDao.class).clone();
       this.coverShowDaoConfig = uDaoConfig1;
       uDaoConfig1.initIdentityScope(p1);
       DaoConfig uDaoConfig2 = p2.get(OperationDao.class).clone();
       this.operationDaoConfig = uDaoConfig2;
       uDaoConfig2.initIdentityScope(p1);
       DaoConfig uDaoConfig3 = p2.get(CommentShowDao.class).clone();
       this.commentShowDaoConfig = uDaoConfig3;
       uDaoConfig3.initIdentityScope(p1);
       RealShowDao realShowDao = new RealShowDao(uDaoConfig, this);
       this.realShowDao = realShowDao;
       CoverShowDao uCoverShowDa = new CoverShowDao(uDaoConfig1, this);
       this.coverShowDao = uCoverShowDa;
       OperationDao operationDao = new OperationDao(uDaoConfig2, this);
       this.operationDao = operationDao;
       CommentShowDao uCommentShow = new CommentShowDao(uDaoConfig3, this);
       this.commentShowDao = uCommentShow;
       this.registerDao(RealShow.class, realShowDao);
       this.registerDao(CoverShow.class, uCoverShowDa);
       this.registerDao(Operation.class, operationDao);
       this.registerDao(CommentShow.class, uCommentShow);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, DaoSession.class, "1")) {
          return;
       }
       this.realShowDaoConfig.clearIdentityScope();
       this.coverShowDaoConfig.clearIdentityScope();
       this.operationDaoConfig.clearIdentityScope();
       this.commentShowDaoConfig.clearIdentityScope();
       return;
    }
    public CommentShowDao getCommentShowDao(){
       return this.commentShowDao;
    }
    public CoverShowDao getCoverShowDao(){
       return this.coverShowDao;
    }
    public OperationDao getOperationDao(){
       return this.operationDao;
    }
    public RealShowDao getRealShowDao(){
       return this.realShowDao;
    }
}
