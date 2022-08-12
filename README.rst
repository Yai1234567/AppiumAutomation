================
Appium Automation
================
This is a sample automation framework project created on sample public APK using Appium & TestNG.
Following are the instructions to set-up & run test suite in macOSX

Getting Started
==============
1. Download and install JDK1.8 & JRE from ORACLE `JAVASE <https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html>`_
2. Download and install `AndroidStudio <https://developer.android.com/studio>`_
3. Download and install `Node <https://nodejs.org/en/download>`_

4. Set following environment variables:
      * export JAVA_HOME=$( /usr/libexec/java_home)
      * export ANDROID_HOME=/Users/<username>/Library/Android/sdk
      * export PATH=$PATH:$ANDROID_HOME/platform-tools
      * export PATH=$PATH:$ANDROID_HOME/tools
      * export PATH=$PATH:$ANDROID_HOME/tools/bin
      * export PATH=$PATH:$ANDROID_HOME/emulator
5. Open Android Studio and configure Emulator by following below steps:
  a. Goto **Tools** > **Device Manager**
  b. Select **Virtual Device** tab
  c. Click on **Create Device**
  d. Select configuration of your choice. Download the Adnroid version if prompted & save
  
6. Install Appium
    $ npm install -g appium@next
    
7. Run appium server
    $ appium
7. Install `Eclipse <https://www.eclipse.org/downloads/packages/release/indigo/r/eclipse-ide-java-developers>`_ editor

8. Fork and download the given repo. Open in eclipse
9. In *src/test/java/Appium.Automation/BaseTest.java*   **line 27**   replace */Users/yaiheikrujan/eclipse-workspace* with path of downloaded repo
10. Select Appium.Automation in *src/test/java*. Goto **RUN** > **RUN AS** > **TESTNG**
  
