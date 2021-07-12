# minecode #
## description ##
* here is the workspace for minecraft plugins, modes and libraries;
* subdirectory server contains local paper server;
* subdirectories with "mine" or "mc_" prefix are java source code plugin projects;
## languages ##
code | usefor
---- | ------
java | source
yml  | config
xml  | config
## environment ##
* this is set up primarly for portable vscode;
    * java configuration in the workspace file needs to be changed
    because it uses local path of the machiene that developer used;
* building system is targeted on maven;
* theoretically, it can run with maven in the terminal;
* attentions to extensions!
    * java project manager does not show any projects
        * unless you add the workspace folder!
        * just opening/creating java project did not help me;