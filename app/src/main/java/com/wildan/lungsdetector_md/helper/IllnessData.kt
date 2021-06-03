package com.wildan.lungsdetector_md.helper

import com.wildan.lungsdetector_md.database.DataIllnessEntity

object IllnessData {

    val IllnessList = listOf<DataIllnessEntity>(

        DataIllnessEntity(1, "severe",
        """
            Pneumonia is an infection that inflames the air sacs in one or both lungs. The air sacs may fill with fluid or pus (purulent material), causing cough with phlegm or pus, fever, chills, and difficulty breathing. A variety of organisms, including bacteria, viruses and fungi, can cause pneumonia.

            Pneumonia can range in seriousness from mild to life-threatening. It is most serious for infants and young children, people older than age 65, and people with health problems or weakened immune systems.
        """.trimIndent(), "pneumonia"),

/*            Symptoms
            The signs and symptoms of pneumonia vary from mild to severe, depending on factors such as the type of germ causing the infection, and your age and overall health. Mild signs and symptoms often are similar to those of a cold or flu, but they last longer.

            Signs and symptoms of pneumonia may include:

            Chest pain when you breathe or cough
            Confusion or changes in mental awareness (in adults age 65 and older)
            Cough, which may produce phlegm
            Fatigue
            Fever, sweating and shaking chills
            Lower than normal body temperature (in adults older than age 65 and people with weak immune systems)
            Nausea, vomiting or diarrhea
            Shortness of breath
            Newborns and infants may not show any sign of the infection. Or they may vomit, have a fever and cough, appear restless or tired and without energy, or have difficulty breathing and eating.

            When to see a doctor
            See your doctor if you have difficulty breathing, chest pain, persistent fever of 102 F (39 C) or higher, or persistent cough, especially if you're coughing up pus.

            It's especially important that people in these high-risk groups see a doctor:

            Adults older than age 65
            Children younger than age 2 with signs and symptoms
            People with an underlying health condition or weakened immune system
            People receiving chemotherapy or taking medication that suppresses the immune system
            For some older adults and people with heart failure or chronic lung problems, pneumonia can quickly become a life-threatening condition.
            Causes
            Many germs can cause pneumonia. The most common are bacteria and viruses in the air we breathe. Your body usually prevents these germs from infecting your lungs. But sometimes these germs can overpower your immune system, even if your health is generally good.

            Pneumonia is classified according to the types of germs that cause it and where you got the infection.

            Community-acquired pneumonia
            Community-acquired pneumonia is the most common type of pneumonia. It occurs outside of hospitals or other health care facilities. It may be caused by:

            Bacteria. The most common cause of bacterial pneumonia in the U.S. is Streptococcus pneumoniae. This type of pneumonia can occur on its own or after you've had a cold or the flu. It may affect one part (lobe) of the lung, a condition called lobar pneumonia.
            Bacteria-like organisms. Mycoplasma pneumoniae also can cause pneumonia. It typically produces milder symptoms than do other types of pneumonia. Walking pneumonia is an informal name given to this type of pneumonia, which typically isn't severe enough to require bed rest.
            Fungi. This type of pneumonia is most common in people with chronic health problems or weakened immune systems, and in people who have inhaled large doses of the organisms. The fungi that cause it can be found in soil or bird droppings and vary depending upon geographic location.
            Viruses, including COVID-19. Some of the viruses that cause colds and the flu can cause pneumonia. Viruses are the most common cause of pneumonia in children younger than 5 years. Viral pneumonia is usually mild. But in some cases it can become very serious. Coronavirus 2019 (COVID-19) may cause pneumonia, which can become severe.
            Hospital-acquired pneumonia
            Some people catch pneumonia during a hospital stay for another illness. Hospital-acquired pneumonia can be serious because the bacteria causing it may be more resistant to antibiotics and because the people who get it are already sick. People who are on breathing machines (ventilators), often used in intensive care units, are at higher risk of this type of pneumonia.

            Health care-acquired pneumonia
            Health care-acquired pneumonia is a bacterial infection that occurs in people who live in long-term care facilities or who receive care in outpatient clinics, including kidney dialysis centers. Like hospital-acquired pneumonia, health care-acquired pneumonia can be caused by bacteria that are more resistant to antibiotics.

            Aspiration pneumonia
            Aspiration pneumonia occurs when you inhale food, drink, vomit or saliva into your lungs. Aspiration is more likely if something disturbs your normal gag reflex, such as a brain injury or swallowing problem, or excessive use of alcohol or drugs.

            Risk factors
            Pneumonia can affect anyone. But the two age groups at highest risk are:

            Children who are 2 years old or younger
            People who are age 65 or older
            Other risk factors include:

            Being hospitalized. You're at greater risk of pneumonia if you're in a hospital intensive care unit, especially if you're on a machine that helps you breathe (a ventilator).
            Chronic disease. You're more likely to get pneumonia if you have asthma, chronic obstructive pulmonary disease (COPD) or heart disease.
            Smoking. Smoking damages your body's natural defenses against the bacteria and viruses that cause pneumonia.
            Weakened or suppressed immune system. People who have HIV/AIDS, who've had an organ transplant, or who receive chemotherapy or long-term steroids are at risk.
            Complications
            Even with treatment, some people with pneumonia, especially those in high-risk groups, may experience complications, including:

            Bacteria in the bloodstream (bacteremia). Bacteria that enter the bloodstream from your lungs can spread the infection to other organs, potentially causing organ failure.
            Difficulty breathing. If your pneumonia is severe or you have chronic underlying lung diseases, you may have trouble breathing in enough oxygen. You may need to be hospitalized and use a breathing machine (ventilator) while your lung heals.
            Fluid accumulation around the lungs (pleural effusion). Pneumonia may cause fluid to build up in the thin space between layers of tissue that line the lungs and chest cavity (pleura). If the fluid becomes infected, you may need to have it drained through a chest tube or removed with surgery.
            Lung abscess. An abscess occurs if pus forms in a cavity in the lung. An abscess is usually treated with antibiotics. Sometimes, surgery or drainage with a long needle or tube placed into the abscess is needed to remove the pus.
            Prevention
            To help prevent pneumonia:

            Get vaccinated. Vaccines are available to prevent some types of pneumonia and the flu. Talk with your doctor about getting these shots. The vaccination guidelines have changed over time so make sure to review your vaccination status with your doctor even if you recall previously receiving a pneumonia vaccine.
            Make sure children get vaccinated. Doctors recommend a different pneumonia vaccine for children younger than age 2 and for children ages 2 to 5 years who are at particular risk of pneumococcal disease. Children who attend a group child care center should also get the vaccine. Doctors also recommend flu shots for children older than 6 months.
            Practice good hygiene. To protect yourself against respiratory infections that sometimes lead to pneumonia, wash your hands regularly or use an alcohol-based hand sanitizer.
            Don't smoke. Smoking damages your lungs' natural defenses against respiratory infections.
            Keep your immune system strong. Get enough sleep, exercise regularly and eat a healthy diet.*/
        DataIllnessEntity(2, "normal",
        """
            Your lungs is healthy ♡! 
        """.trimIndent(), "normal"),
     /*       try these tips to avoid any future posibility of getting any lungs related illness :
            
            Don't Smoke
            Cigarette smoking is the major cause of lung cancer and chronic obstructive pulmonary disease (COPD), which includes chronic bronchitis and emphysema. Cigarette smoke can narrow the air passages and make breathing more difficult. It causes chronic inflammation, or swelling in the lung, which can lead to chronic bronchitis. Over time cigarette smoke destroys lung tissue and may trigger changes that grow into cancer. If you smoke, it's never too late to benefit from quitting. The American Lung Association can help whenever you are ready.

            Avoid Exposure to Indoor Pollutants That Can Damage Your Lungs
            Secondhand smoke, chemicals in the home and workplace, and radon all can cause or worsen lung disease. Make your home and car smokefree. Test your home for radon. Avoid exercising outdoors on bad air days. And talk to your healthcare provider if you are worried that something in your home, school or work may be making you sick.

            Minimize Exposure to Outdoor Air Pollution
            The air quality outside can vary from day to day and sometimes is unhealthy to breathe. Knowing how outdoor air pollution affects your health and useful strategies to minimize prolonged exposure can help keep you and your family well. Climate change and natural disasters can also directly impact lung health.

            Prevent Infection
            A cold or other respiratory infection can sometimes become very serious. There are several things you can do to protect yourself:

            Wash your hands often with soap and water. Alcohol-based cleaners are a good substitute if you cannot wash.
            Avoids crowds during the cold and flu season.
            Good oral hygiene can protect you from the germs in your mouth leading to infections. Brush your teeth at least twice daily and see your dentist at least every six months.
            Get vaccinated every year against influenza. Talk to your healthcare provider to find out if the pneumonia vaccine is right for you.
            If you get sick, keep it to yourself! Protect the people around you, including your loved ones, by keeping your distance. Stay home from work or school until you're feeling better.
            Get Regular Check-ups
            Regular check-ups help prevent diseases, even when you are feeling well. This is especially true for lung disease, which sometimes goes undetected until it is serious. During a check-up, your healthcare provider will listen to your breathing and listen to your concerns. If you need health insurance, learn more about your options.

            Exercise
            Whether you are young or old, slender or large, able-bodied or living with a chronic illness or disability, being physically active can help keep your lungs healthy. Learn more about how exercise can strengthen your lungs.*/
   /*     """.trimIndent(), "normal"),*/
            DataIllnessEntity(3, "normal",
        """
            COVID-19 is a respiratory condition caused by a coronavirus. Some people are infected but don’t notice any symptoms. Most people will have mild symptoms and get better on their own. But about 1 in 6 will have severe problems, such as trouble breathing. The odds of more serious symptoms are higher if you’re older or have another health condition like diabetes or heart disease.
        """.trimIndent(), "COVID-19")
          /*  Here’s what to look for if you think you might have COVID-19.

            Common Symptoms
            Researchers in China found that the most common symptoms among people who were hospitalized with COVID-19 include:

            Fever: 99%
            Fatigue:70%
            A dry cough: 59%
            Loss of appetite: 40%
            Body aches: 35%
            Shortness of breath: 31%
            Mucus or phlegm: 27%
            Symptoms usually begin 2 to 14 days after you come into contact with the virus.

            Other symptoms may include:


            Sore throat
            Headache
            Chills, sometimes with shaking
            Loss of smell or taste
            Congestion or runny nose
            Nausea or vomiting
            Diarrhea
            Emergency Symptoms
            Call a doctor or hospital right away if you have one or more of these COVID-19 symptoms:

            Trouble breathing
            Constant pain or pressure in your chest
            Bluish lips or face
            Sudden confusion
            You need medical care as soon as possible. Call your doctor’s office or hospital before you go in. This will help them prepare to treat you and protect medical staff and other patients.

            Strokes have also been reported in some people who have COVID-19. Remember FAST:

            Face. Is one side of the person’s face numb or drooping? Is their smile lopsided?
            Arms. Is one arm weak or numb? If they try to raise both arms, does one arm sag?
            Speech. Can they speak clearly? Ask them to repeat a sentence.
            Time. Every minute counts when someone shows signs of a stroke. Call 911 right away.

            Many drugs have been considered for treatment of COVID-19: some are monoclonal antibodies that have been granted emergency use authorizations . Only remdesivir (Veklury), an IV antiviral drug has been approved by the FDA, and it is only approved for use in hospitalized patients.
            Other COVID-19 Symptoms
            COVID-19 can also cause problems including:

            Pinkeye
            Swollen eyes
            Fainting
            Guillain-Barre syndrome
            Coughing up blood
            Blood clots
            Seizures
            Heart problems
            Kidney damage
            Liver problems or damage
            Some doctors have reported rashes tied to COVID-19, including purple or blue lesions on children’s toes and feet. Researchers are looking into these reports so they can understand the effect on people who have COVID-19.

            Symptoms in Children
            Researchers say kids have many of the same COVID-19 symptoms as adults, but they tend to be milder. Common symptoms in children include:

            Fever: 56%
            Cough: 54%
            Shortness of breath: 13%
            Some children and teens who are in the hospital with the disease have an inflammatory syndrome that may be linked to the new coronavirus. Doctors call it pediatric multisystem inflammatory syndrome (PMIS). Symptoms include a fever, a rash, belly pain, vomiting, diarrhea, and heart problems. It’s similar to toxic shock or to Kawasaki disease, a condition in children that causes inflammation in blood vessels.

            How to Check for Fever
            Your regular body temperature may be higher or lower than someone else’s. It also changes throughout the day. Doctors generally consider a fever in an adult to be anything over 100.4 F on an oral thermometer and over 100.8 F on a rectal thermometer.

            If you think you’ve come into contact with the virus, or if you have symptoms, isolate yourself and check your temperature every morning and evening for at least 14 days. Keep track of the readings. A fever is the most common symptom of COVID-19, but it’s sometimes below 100 F. In a child, a fever is a temperature above 100 F on an oral thermometer or 100.4 F on a rectal one.

            What Kind of Cough Is Common?
            Early studies have found that at least 60% of people with COVID-19 have a dry cough. About a third have a cough with mucus, called a “wet” or “productive” cough.

            What to Do If You Think You Have Mild Symptoms
            If you have milder symptoms like a fever, shortness of breath, or coughing:

            Stay home unless you need medical care. If you do need to go in, call your doctor or hospital first for guidance.
            Tell your doctor about your illness. If you’re at high risk of complications because of your age or other health conditions, they might have more instructions.
            Isolate yourself. This means staying away from other people as much as possible, even members of your family. Stay in a specific “sick room,” and use a separate bathroom if you can.
            Wear a cloth face covering if you have to be around anyone else. This includes people you live with.
            Rest up, and drink plenty of fluids. Over-the-counter medicines might help you feel better.
            Keep track of your symptoms. If they get worse, get medical help right away.
            What Does Shortness of Breath Feel Like?
            Dyspnea is the word doctors use for shortness of breath. It can feel like you:

            Have tightness in your chest
            Can’t catch your breath
            Can’t get enough air into your lungs
            Can’t breathe deeply
            Are smothering, drowning, or suffocating
            Have to work harder than usual to breathe in or out
            Need to breathe in before you’re done breathing out
            You should monitor your oxygen levels and if they dip into the 80s, contact your doctor. If your face and/or lips get a bluish tint, call 911 immediately.

            Is It COVID-19, the Flu, a Cold, or Allergies?
            Since they share so many symptoms, it can be hard to know which condition you have. But there are a few guidelines that can help.

            You may have COVID-19 if you have a fever and trouble breathing, along with the symptoms listed above.

            If you don’t have problems breathing, it might be the flu. You should still isolate yourself just in case.

            It’s probably allergies if you don’t have a fever but your eyes are itchy, you’re sneezing, and you have a runny nose.

            If you don’t have a fever and your eyes aren’t itchy, it’s probably a cold.

            Call your doctor if you’re concerned about any symptoms. COVID-19 can range from mild to severe, so it may be hard to diagnose. Testing could be available in your area.

            How to Protect Yourself
            There are COVID-19 vaccines available and you should get one, if possible. Otherwise, take these steps to prevent COVID-19:

            Wash your hands often, for at least 20 seconds each time, with soap and water.
            Use an alcohol-based sanitizer with at least 60% alcohol if you don't have soap and water handy.
            Limit your contact with other people. Stay at least 6 feet away from others if you have to go out.
            Wear a cloth face mask in public places.
            Avoid people who are sick.
            Don’t touch your eyes, nose, or mouth unless you’ve just washed your hands.
            Regularly clean and disinfect surfaces that you touch a lot.

            Caring for Someone Who Has COVID-19 Symptoms
            If you’re taking care of someone who’s sick, follow these steps to protect yourself:

            Limit your contact as much as you can. Stay in separate rooms. If you have to be in the same room, use a fan or an open window to improve air flow.
            Ask the person who’s sick to wear a cloth face mask when you’re around each other. You should wear one, too.
            Don’t share items like electronics, bedding, or dishes.
            Use gloves when handling the other person’s dishes, laundry, or trash. When you’re done, throw away the gloves and wash your hands.
            Regularly clean and disinfect common surfaces such as doorknobs, light switches, faucets, and countertops.
            Take care of yourself. Get enough rest and nutrition. Watch for COVID-19 symptoms.
        """.trimIndent(), "COVID-19")*/

    )
}