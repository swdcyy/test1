package com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig$id$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig$charset$2;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig$saveFile$2;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import java.lang.String;
import java.nio.charset.Charset;
import java.io.File;
import gb7.a;
import gb7.b;
import java.util.List;

public abstract class DownloadConfig	// class@000f4d
{
    public final DownloadTask$DownloadBizExtra bizExtra;
    public final String bizType;
    public final p charset$delegate;
    public final DownloadTask$DownloadTaskType downloadPriority;
    public final boolean enableDnsResolver;
    public final File fileFolder;
    public final String fileName;
    public final p id$delegate;
    public final boolean isSyncCallback;
    public final String md5;
    public final boolean needCdnReport;
    public final boolean needUnzip;
    public final p saveFile$delegate;
    public final File unzipFolder;

    public void DownloadConfig(){
       super();
       this.id$delegate = s.c(DownloadConfig$id$2.INSTANCE);
       this.needUnzip = true;
       this.charset$delegate = s.c(DownloadConfig$charset$2.INSTANCE);
       this.saveFile$delegate = s.c(new DownloadConfig$saveFile$2(this));
       this.downloadPriority = DownloadTask$DownloadTaskType.ENQUEUE;
       this.needCdnReport = true;
    }
    public DownloadTask$DownloadBizExtra getBizExtra(){
       return this.bizExtra;
    }
    public String getBizType(){
       return this.bizType;
    }
    public Charset getCharset(){
       return this.charset$delegate.getValue();
    }
    public DownloadTask$DownloadTaskType getDownloadPriority(){
       return this.downloadPriority;
    }
    public boolean getEnableDnsResolver(){
       return this.enableDnsResolver;
    }
    public File getFileFolder(){
       return this.fileFolder;
    }
    public String getFileName(){
       return this.fileName;
    }
    public String getId(){
       return this.id$delegate.getValue();
    }
    public a getListenerDelegate(){
       return new b(this);
    }
    public String getMd5(){
       return this.md5;
    }
    public boolean getNeedCdnReport(){
       return this.needCdnReport;
    }
    public boolean getNeedUnzip(){
       return this.needUnzip;
    }
    public abstract String getProjectName();
    public abstract List getResourceUrls();
    public final File getSaveFile(){
       return this.saveFile$delegate.getValue();
    }
    public File getUnzipFolder(){
       return this.unzipFolder;
    }
    public boolean isSyncCallback(){
       return this.isSyncCallback;
    }
}
