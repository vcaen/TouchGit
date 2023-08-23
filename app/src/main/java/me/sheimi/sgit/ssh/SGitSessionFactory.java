package me.sheimi.sgit.ssh;

/**
 * Custom config for Jsch, including using user-provided private keys
 */
public class SGitSessionFactory {}/*
public class SGitSessionFactory extends TransportGitSsh {

    @Override
    protected void configure(Host host, Session session) {
        session.setConfig("StrictHostKeyChecking", "no");
        session.setConfig("PreferredAuthentications", "publickey,password");

        // Awful use of App singleton but not really any other way to get hold of a provider that needs
        // to have been initialised with an Android context
        UserInfo userInfo = new CredentialsProviderUserInfo(session, MGitApplication.getJschCredentialsProvider());
        session.setUserInfo(userInfo);
    }


    @Override
    protected JSch createDefaultJSch(FS fs) throws JSchException {
        JSch jsch = new JSch();
        PrivateKeyUtils.migratePrivateKeys();
        File sshDir = PrivateKeyUtils.getPrivateKeyFolder();
        for (File file : sshDir.listFiles()) {
            KeyPair kpair = KeyPair.load(jsch, file.getAbsolutePath());
            jsch.addIdentity(file.getAbsolutePath());
        }
        return jsch;
    }

}
*/
