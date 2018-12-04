package cn.aegisa.sesisondemo.configuration;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.Session;
import org.apache.catalina.session.ManagerBase;

import java.io.IOException;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2018/12/4 15:32
 */
public class NoSessionManager extends ManagerBase {
    @Override
    public void load() throws ClassNotFoundException, IOException {
    }

    @Override
    public void unload() throws IOException {
    }

    @Override
    public void add(Session session) {
        System.out.println("来了老弟");
        // do nothing
    }

    @Override
    protected void startInternal() throws LifecycleException {
        super.startInternal();
        this.setState(LifecycleState.STARTING);
    }

    @Override
    protected void stopInternal() throws LifecycleException {
        this.setState(LifecycleState.STOPPING);
        super.stopInternal();
    }


}
