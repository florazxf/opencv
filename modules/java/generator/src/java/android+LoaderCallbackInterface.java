package org.opencv.android;

/**
 * Interface for callback object in case of asynchronous initialization of OpenCV.
 */
public interface LoaderCallbackInterface
{
    /**
     * OpenCV initialization finished successfully.
     */
    static final int SUCCESS = 0;
    /**
     * OpenCV library installation via Google Play service has been initialized. Restart the application.
     */
    static final int RESTART_REQUIRED = 1;
    /**
     * Google Play Market cannot be invoked.
     */
    static final int MARKET_ERROR = 2;
    /**
     * OpenCV library installation has been canceled by user.
     */
    static final int INSTALL_CANCELED = 3;
    /**
     * This version of OpenCV Manager Service is incompatible with the app. Possibly, a service update is required.
     */
    static final int INCOMPATIBLE_MANAGER_VERSION = 4;
    /**
     * OpenCV library initialization failed.
     */
    static final int INIT_FAILED = 0xff;

    /**
     * This callback method is called after OpenCV library initialization.
     * @param status Status of initialization (see Initialization status constants).
     */
    public void onManagerConnected(int status);

    /**
     * This callback method is called in case the package installation is needed.
     * @param callback Answer object with approve and cancel methods and the package description.
     */
    public void onPackageInstall(InstallCallbackInterface callback);
};
