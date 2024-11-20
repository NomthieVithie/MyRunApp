Purpose of the App

The purpose of this App is to encourage running/ jogging and what better way than to do that with the use of technology. This app will work as a motivator to those who are keen on starting a healthier fitness lifestyle, think of it as a “gym buddy”, users of the app will be able to access their weekly distance ran (in KM’s) by the end of week you can use the calculate average function to see how you performed each week. As time goes by you will be able to see the progress you made as a runner from those weekly average runs which can be stored on your app for later access. 
![Screenshot (1)](https://github.com/user-attachments/assets/ec6a2f86-ee9a-488a-9667-b9ea67fe664f)

![Screenshot 2024-11-20 130103](https://github.com/user-attachments/assets/f39964b3-994c-4d99-abb6-bbba98a852cb)

![Screenshot 2024-11-20 125900](https://github.com/user-attachments/assets/88dfd540-e306-40b6-afa9-bcc0b76164d2)
![Screenshot (8)](https://github.com/user-attachments/assets/c280f34e-f0ac-41c5-8ff4-549e1326f172)


Pseudocede:

FUNCTION SplashScreen
    DISPLAY app logo
    WAIT 3 seconds
    NAVIGATE TO MainScreen
END FUNCTION

FUNCTION MainScreen
    INPUT date, morningRun, afternoonRun, notes
    IF SaveButton.Clicked THEN
        IF all fields are filled THEN
            SAVE data to dateList
            DISPLAY "Data saved successfully!"
        ELSE
            DISPLAY "Please fill in all fields!"
        END IF
    END IF

    IF ClearButton.Clicked THEN
        CLEAR all input fields
        DISPLAY "Fields cleared!"
    END IF

    IF ViewDetailsButton.Clicked THEN
        NAVIGATE TO DetailsScreen
    END IF
END FUNCTION

FUNCTION DetailsScreen
    DISPLAY run entries from dateList in RecyclerView
    IF dateList IS NOT EMPTY THEN
        totalDistance = SUM of morningRun and afternoonRun for all entries
        totalRuns = COUNT of morningRun and afternoonRun entries
        averageDistance = totalDistance / totalRuns
        DISPLAY "Average Run Distance: averageDistance km"
    ELSE
        DISPLAY "No run data available"
    END IF

    IF BackButton.Clicked THEN
        NAVIGATE TO MainScreen
    END IF
END FUNCTION



