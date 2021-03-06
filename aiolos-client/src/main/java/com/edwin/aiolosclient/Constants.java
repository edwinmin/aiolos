package com.edwin.aiolosclient;

/**
 * @author jinming.wu
 * @date 2015-5-11
 */
public class Constants {

    public static String       ENV_FILE_PATH              = "/data/webapps/appenv";

    public static final String KEY_DEPLOYENV              = "deployenv";

    public static final String KEY_ZKSERVER               = "zkserver";

    public static final String DEFAULT_DEPLOYENV          = "dev";

    public static final String DEFAULT_ZKSERVER           = "192.168.1.11:2181";

    // read from property
    public static int          DEFAULT_SESSION_TIMEOUT    = Integer.getInteger("aiolos-default-session-timeout",
                                                                               60 * 1000);

    public static int          DEFAULT_SYNC_INTERVAL      = Integer.getInteger("aiolos-default-sync-interval",
                                                                               300 * 100);

    public static int          DEFAULT_CONNECTION_TIMEOUT = Integer.getInteger("aiolos-default-connection-timeout",
                                                                               15 * 1000);

    public static int          BASE_SLEEP_MS              = Integer.getInteger("aiolos-base-sleep-ms", 5 * 1000);

    public static int          MAX_TRY_TIMES              = Integer.getInteger("aiolos-max-try-times", 3);

    /** just for test */
    public static String       DEFAULT_CONNECTION         = "192.168.1.11:2181";

    public static String       NAMESPACE                  = "aiolos";

    public static String       BASE_PATH                  = "/aiolos";

    public static String       CONFIG_PATH                = BASE_PATH + "/config";

    public static final String SEPARATOR                  = "/";

    public static final String TIMESTAMP                  = "TIMESTAMP";

    public static String       CHARSET                    = "UTF-8";

    public static final String DEFAULT_PLACEHOLDER_PREFIX = "${";

    public static final String DEFAULT_PLACEHOLDER_SUFFIX = "}";
}
