package gogo.dog.remindme.server.Service;

import gogo.dog.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {
    List<Remind> getAll();

    Remind getById(long remindID);

    Remind save(Remind remind);

    void remove(long id);
}
