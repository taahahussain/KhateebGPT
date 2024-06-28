The Following program hopes to streamline the process of writing a khtubah by utilizng NLP Models to categrozied resources such as Hadith, Quranic Verses, online articles, and youtube lectures

Tech Stack:

Training AI/ML Model:
  Python - KeyBert, SentenceTransformers, DBscan, Pandas, MatplotLip, SKlearn

Backend:
  Python - Django, SQL ( May need to use AWS due to larger storage requirement for later stages 

Frontend:
  React Or Vue JS

Project Development Stages:
  Stage 1 - Goal Finish before Fall semester starts
    Use and Refine Pre-trained model to categorize Hadith based on keywords, meaning, and topic relevance.
    Begin Designing FrontEnd of the Web application using Figma
    Research Database options and find cosr efficient solution that fits our needs
  Stage 2 - Goal Finish by End of Septemeber
    Integrate Quran Companion GPT ( Open AI API extension ), will require research as to how to access data from a specific GPT
    OPTIONAL: Train our own model from sratch to extract Hadith
    Create the ChatBot User Interface and integrate with backend
  Stage 3 - Goal Finish by the ThanksGiving Break
    Allow users to upload PDF Dcouments
    Use Google OCR to extract text to be input into model.
    Integrate/Add new data into database
  Stage 4 - Finish by End of January 
    Allow users to upload videos; create a script to accurately extract text from audio ( since youtube trascription is not accuracte when arabic terms come into the mix ) 
    Optional: Take notes for user from the video, provide summaries for the video, etc
    Use text classification model and refine it to get more accurate results
  Final Stage - Release and Present Final Product at Showdown ( if somehow possible )
    Conduct Final testing and integration 
    Host on AWS using S3 and EC2 Instances
    Use load balancer to divide traffic efficiently 
    Present final product to MSAs of Texas 

To Run the program:

Open Notebook, adn download the zip.

Upload to notebook and run each cell individually 
